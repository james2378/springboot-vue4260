package com.entity.view;

import com.entity.DiscussdongmanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
 

/**
 * 漫画信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-12-05 20:50:10
 */
@TableName("discussdongmanxinxi")
public class DiscussdongmanxinxiView  extends DiscussdongmanxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussdongmanxinxiView(){
	}
 
 	public DiscussdongmanxinxiView(DiscussdongmanxinxiEntity discussdongmanxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussdongmanxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}

}
