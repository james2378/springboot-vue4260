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

import com.entity.DongmanxinxiEntity;
import com.entity.view.DongmanxinxiView;

import com.service.DongmanxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.MapUtils;
import com.utils.CommonUtil;
import java.io.IOException;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 漫画信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
@RestController
@RequestMapping("/dongmanxinxi")
public class DongmanxinxiController {
    @Autowired
    private DongmanxinxiService dongmanxinxiService;

    @Autowired
    private StoreupService storeupService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DongmanxinxiEntity dongmanxinxi,
		HttpServletRequest request){
        EntityWrapper<DongmanxinxiEntity> ew = new EntityWrapper<DongmanxinxiEntity>();

		PageUtils page = dongmanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dongmanxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DongmanxinxiEntity dongmanxinxi, 
		HttpServletRequest request){
        EntityWrapper<DongmanxinxiEntity> ew = new EntityWrapper<DongmanxinxiEntity>();

		PageUtils page = dongmanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dongmanxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DongmanxinxiEntity dongmanxinxi){
       	EntityWrapper<DongmanxinxiEntity> ew = new EntityWrapper<DongmanxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dongmanxinxi, "dongmanxinxi")); 
        return R.ok().put("data", dongmanxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DongmanxinxiEntity dongmanxinxi){
        EntityWrapper< DongmanxinxiEntity> ew = new EntityWrapper< DongmanxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dongmanxinxi, "dongmanxinxi")); 
		DongmanxinxiView dongmanxinxiView =  dongmanxinxiService.selectView(ew);
		return R.ok("查询漫画信息成功").put("data", dongmanxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DongmanxinxiEntity dongmanxinxi = dongmanxinxiService.selectById(id);
		dongmanxinxi.setClicktime(new Date());
		dongmanxinxiService.updateById(dongmanxinxi);
        return R.ok().put("data", dongmanxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DongmanxinxiEntity dongmanxinxi = dongmanxinxiService.selectById(id);
		dongmanxinxi.setClicktime(new Date());
		dongmanxinxiService.updateById(dongmanxinxi);
        return R.ok().put("data", dongmanxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DongmanxinxiEntity dongmanxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(dongmanxinxi);
        dongmanxinxiService.insert(dongmanxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DongmanxinxiEntity dongmanxinxi, HttpServletRequest request){
    	//ValidatorUtils.validateEntity(dongmanxinxi);
        dongmanxinxiService.insert(dongmanxinxi);
        return R.ok();
    }




    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DongmanxinxiEntity dongmanxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dongmanxinxi);
        dongmanxinxiService.updateById(dongmanxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dongmanxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,DongmanxinxiEntity dongmanxinxi, HttpServletRequest request,String pre){
        EntityWrapper<DongmanxinxiEntity> ew = new EntityWrapper<DongmanxinxiEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicktime");
        params.put("order", "desc");
		PageUtils page = dongmanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dongmanxinxi), params), params));
        return R.ok().put("data", page);
    }


    /**
     * 协同算法（按收藏推荐）
     */
    @RequestMapping("/autoSort2")
    public R autoSort2(@RequestParam Map<String, Object> params,DongmanxinxiEntity dongmanxinxi, HttpServletRequest request){
        String userId = request.getSession().getAttribute("userId").toString();
        String inteltypeColumn = "dongmanfenlei";
        List<StoreupEntity> storeups = storeupService.selectList(new EntityWrapper<StoreupEntity>().eq("type", 1).eq("userid", userId).eq("tablename", "dongmanxinxi").orderBy("addtime", false));
        List<String> inteltypes = new ArrayList<String>();
        Integer limit = params.get("limit")==null?10:Integer.parseInt(params.get("limit").toString());
        List<DongmanxinxiEntity> dongmanxinxiList = new ArrayList<DongmanxinxiEntity>();
        //去重
        if(storeups!=null && storeups.size()>0) {
            for(StoreupEntity s : storeups) {
                dongmanxinxiList.addAll(dongmanxinxiService.selectList(new EntityWrapper<DongmanxinxiEntity>().eq(inteltypeColumn, s.getInteltype())));
            }
        }
        EntityWrapper<DongmanxinxiEntity> ew = new EntityWrapper<DongmanxinxiEntity>();
        params.put("sort", "id");
        params.put("order", "desc");
        PageUtils page = dongmanxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dongmanxinxi), params), params));
        List<DongmanxinxiEntity> pageList = (List<DongmanxinxiEntity>)page.getList();
        if(dongmanxinxiList.size()<limit) {
            int toAddNum = (limit-dongmanxinxiList.size())<=pageList.size()?(limit-dongmanxinxiList.size()):pageList.size();
            for(DongmanxinxiEntity o1 : pageList) {
                boolean addFlag = true;
                for(DongmanxinxiEntity o2 : dongmanxinxiList) {
                    if(o1.getId().intValue()==o2.getId().intValue()) {
                        addFlag = false;
                        break;
                    }
                }
                if(addFlag) {
                    dongmanxinxiList.add(o1);
                    if(--toAddNum==0) break;
                }
            }
        } else if(dongmanxinxiList.size()>limit) {
            dongmanxinxiList = dongmanxinxiList.subList(0, limit);
        }
        page.setList(dongmanxinxiList);
        return R.ok().put("data", page);
    }




    /**
     * （按值统计）
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}")
    public R value(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        EntityWrapper<DongmanxinxiEntity> ew = new EntityWrapper<DongmanxinxiEntity>();
        List<Map<String, Object>> result = dongmanxinxiService.selectValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计(多)）
     */
    @RequestMapping("/valueMul/{xColumnName}")
    public R valueMul(@PathVariable("xColumnName") String xColumnName,@RequestParam String yColumnNameMul, HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<DongmanxinxiEntity> ew = new EntityWrapper<DongmanxinxiEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = dongmanxinxiService.selectValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * （按值统计）时间统计类型
     */
    @RequestMapping("/value/{xColumnName}/{yColumnName}/{timeStatType}")
    public R valueDay(@PathVariable("yColumnName") String yColumnName, @PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("yColumn", yColumnName);
        params.put("timeStatType", timeStatType);
        EntityWrapper<DongmanxinxiEntity> ew = new EntityWrapper<DongmanxinxiEntity>();
        List<Map<String, Object>> result = dongmanxinxiService.selectTimeStatValue(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }

    /**
     * （按值统计）时间统计类型(多)
     */
    @RequestMapping("/valueMul/{xColumnName}/{timeStatType}")
    public R valueMulDay(@PathVariable("xColumnName") String xColumnName, @PathVariable("timeStatType") String timeStatType,@RequestParam String yColumnNameMul,HttpServletRequest request) {
        String[] yColumnNames = yColumnNameMul.split(",");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("xColumn", xColumnName);
        params.put("timeStatType", timeStatType);
        List<List<Map<String, Object>>> result2 = new ArrayList<List<Map<String,Object>>>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        EntityWrapper<DongmanxinxiEntity> ew = new EntityWrapper<DongmanxinxiEntity>();
        for(int i=0;i<yColumnNames.length;i++) {
            params.put("yColumn", yColumnNames[i]);
            List<Map<String, Object>> result = dongmanxinxiService.selectTimeStatValue(params, ew);
            for(Map<String, Object> m : result) {
                for(String k : m.keySet()) {
                    if(m.get(k) instanceof Date) {
                        m.put(k, sdf.format((Date)m.get(k)));
                    }
                }
            }
            result2.add(result);
        }
        return R.ok().put("data", result2);
    }

    /**
     * 分组统计
     */
    @RequestMapping("/group/{columnName}")
    public R group(@PathVariable("columnName") String columnName,HttpServletRequest request) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("column", columnName);
        EntityWrapper<DongmanxinxiEntity> ew = new EntityWrapper<DongmanxinxiEntity>();
        List<Map<String, Object>> result = dongmanxinxiService.selectGroup(params, ew);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        for(Map<String, Object> m : result) {
            for(String k : m.keySet()) {
                if(m.get(k) instanceof Date) {
                    m.put(k, sdf.format((Date)m.get(k)));
                }
            }
        }
        return R.ok().put("data", result);
    }




    /**
     * 总数量
     */
    @RequestMapping("/count")
    public R count(@RequestParam Map<String, Object> params,DongmanxinxiEntity dongmanxinxi, HttpServletRequest request){
        EntityWrapper<DongmanxinxiEntity> ew = new EntityWrapper<DongmanxinxiEntity>();
        int count = dongmanxinxiService.selectCount(MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dongmanxinxi), params), params));
        return R.ok().put("data", count);
    }



}
