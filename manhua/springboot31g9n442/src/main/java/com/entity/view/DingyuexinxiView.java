package com.entity.view;

import com.entity.DingyuexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 订阅信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
@TableName("dingyuexinxi")
public class DingyuexinxiView  extends DingyuexinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingyuexinxiView(){
	}
 
 	public DingyuexinxiView(DingyuexinxiEntity dingyuexinxiEntity){
 	try {
			BeanUtils.copyProperties(this, dingyuexinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
