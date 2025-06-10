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


import com.dao.DingyuexinxiDao;
import com.entity.DingyuexinxiEntity;
import com.service.DingyuexinxiService;
import com.entity.vo.DingyuexinxiVO;
import com.entity.view.DingyuexinxiView;

@Service("dingyuexinxiService")
public class DingyuexinxiServiceImpl extends ServiceImpl<DingyuexinxiDao, DingyuexinxiEntity> implements DingyuexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingyuexinxiEntity> page = this.selectPage(
                new Query<DingyuexinxiEntity>(params).getPage(),
                new EntityWrapper<DingyuexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingyuexinxiEntity> wrapper) {
		  Page<DingyuexinxiView> page =new Query<DingyuexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingyuexinxiVO> selectListVO(Wrapper<DingyuexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingyuexinxiVO selectVO(Wrapper<DingyuexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingyuexinxiView> selectListView(Wrapper<DingyuexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingyuexinxiView selectView(Wrapper<DingyuexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<DingyuexinxiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<DingyuexinxiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<DingyuexinxiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
