package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.GengxintongzhiEntity;
import com.entity.view.GengxintongzhiView;

import com.service.GengxintongzhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 更新通知
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
@RestController
@RequestMapping("/gengxintongzhi")
public class GengxintongzhiController {
    @Autowired
    private GengxintongzhiService gengxintongzhiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,GengxintongzhiEntity gengxintongzhi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			gengxintongzhi.setYonghuming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<GengxintongzhiEntity> ew = new EntityWrapper<GengxintongzhiEntity>();

		PageUtils page = gengxintongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gengxintongzhi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,GengxintongzhiEntity gengxintongzhi, 
		HttpServletRequest request){
        EntityWrapper<GengxintongzhiEntity> ew = new EntityWrapper<GengxintongzhiEntity>();

		PageUtils page = gengxintongzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, gengxintongzhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( GengxintongzhiEntity gengxintongzhi){
       	EntityWrapper<GengxintongzhiEntity> ew = new EntityWrapper<GengxintongzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( gengxintongzhi, "gengxintongzhi")); 
        return R.ok().put("data", gengxintongzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(GengxintongzhiEntity gengxintongzhi){
        EntityWrapper< GengxintongzhiEntity> ew = new EntityWrapper< GengxintongzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( gengxintongzhi, "gengxintongzhi")); 
		GengxintongzhiView gengxintongzhiView =  gengxintongzhiService.selectView(ew);
		return R.ok("查询更新通知成功").put("data", gengxintongzhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        GengxintongzhiEntity gengxintongzhi = gengxintongzhiService.selectById(id);
        return R.ok().put("data", gengxintongzhi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        GengxintongzhiEntity gengxintongzhi = gengxintongzhiService.selectById(id);
        return R.ok().put("data", gengxintongzhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody GengxintongzhiEntity gengxintongzhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gengxintongzhi);
        gengxintongzhiService.insert(gengxintongzhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody GengxintongzhiEntity gengxintongzhi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(gengxintongzhi);
        gengxintongzhiService.insert(gengxintongzhi);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody GengxintongzhiEntity gengxintongzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(gengxintongzhi);
        gengxintongzhiService.updateById(gengxintongzhi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        gengxintongzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
