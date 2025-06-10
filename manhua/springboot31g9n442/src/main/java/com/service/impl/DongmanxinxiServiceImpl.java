package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DongmanxinxiDao;
import com.entity.DongmanxinxiEntity;
import com.service.DongmanxinxiService;
import com.entity.vo.DongmanxinxiVO;
import com.entity.view.DongmanxinxiView;

@Service("dongmanxinxiService")
public class DongmanxinxiServiceImpl extends ServiceImpl<DongmanxinxiDao, DongmanxinxiEntity> implements DongmanxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DongmanxinxiEntity> page = this.selectPage(
                new Query<DongmanxinxiEntity>(params).getPage(),
                new EntityWrapper<DongmanxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DongmanxinxiEntity> wrapper) {
		  Page<DongmanxinxiView> page =new Query<DongmanxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DongmanxinxiVO> selectListVO(Wrapper<DongmanxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DongmanxinxiVO selectVO(Wrapper<DongmanxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DongmanxinxiView> selectListView(Wrapper<DongmanxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DongmanxinxiView selectView(Wrapper<DongmanxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<DongmanxinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<DongmanxinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<DongmanxinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
