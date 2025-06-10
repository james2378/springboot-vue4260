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

import com.entity.DongmanfenleiEntity;
import com.entity.view.DongmanfenleiView;

import com.service.DongmanfenleiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 漫画分类
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
@RestController
@RequestMapping("/dongmanfenlei")
public class DongmanfenleiController {
    @Autowired
    private DongmanfenleiService dongmanfenleiService;




    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DongmanfenleiEntity dongmanfenlei,
		HttpServletRequest request){
        EntityWrapper<DongmanfenleiEntity> ew = new EntityWrapper<DongmanfenleiEntity>();

		PageUtils page = dongmanfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dongmanfenlei), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DongmanfenleiEntity dongmanfenlei, 
		HttpServletRequest request){
        EntityWrapper<DongmanfenleiEntity> ew = new EntityWrapper<DongmanfenleiEntity>();

		PageUtils page = dongmanfenleiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dongmanfenlei), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DongmanfenleiEntity dongmanfenlei){
       	EntityWrapper<DongmanfenleiEntity> ew = new EntityWrapper<DongmanfenleiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dongmanfenlei, "dongmanfenlei")); 
        return R.ok().put("data", dongmanfenleiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DongmanfenleiEntity dongmanfenlei){
        EntityWrapper< DongmanfenleiEntity> ew = new EntityWrapper< DongmanfenleiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dongmanfenlei, "dongmanfenlei")); 
		DongmanfenleiView dongmanfenleiView =  dongmanfenleiService.selectView(ew);
		return R.ok("查询漫画分类成功").put("data", dongmanfenleiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DongmanfenleiEntity dongmanfenlei = dongmanfenleiService.selectById(id);
        return R.ok().put("data", dongmanfenlei);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DongmanfenleiEntity dongmanfenlei = dongmanfenleiService.selectById(id);
        return R.ok().put("data", dongmanfenlei);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DongmanfenleiEntity dongmanfenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(dongmanfenlei);
        dongmanfenleiService.insert(dongmanfenlei);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DongmanfenleiEntity dongmanfenlei, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(dongmanfenlei);
        dongmanfenleiService.insert(dongmanfenlei);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DongmanfenleiEntity dongmanfenlei, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dongmanfenlei);
        dongmanfenleiService.updateById(dongmanfenlei);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dongmanfenleiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	










}
