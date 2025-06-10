package com.entity.view;

import com.entity.GengxintongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 更新通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
@TableName("gengxintongzhi")
public class GengxintongzhiView  extends GengxintongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GengxintongzhiView(){
	}
 
 	public GengxintongzhiView(GengxintongzhiEntity gengxintongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, gengxintongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
