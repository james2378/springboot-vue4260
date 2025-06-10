package com.entity.vo;

import com.entity.GengxintongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 更新通知
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
public class GengxintongzhiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 漫画名称
	 */
	
	private String dongmanmingcheng;
		
	/**
	 * 封面信息
	 */
	
	private String fengmianxinxi;
		
	/**
	 * 通知内容
	 */
	
	private String tongzhineirong;
		
	/**
	 * 通知日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tongzhiriqi;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
				
	
	/**
	 * 设置：漫画名称
	 */
	 
	public void setDongmanmingcheng(String dongmanmingcheng) {
		this.dongmanmingcheng = dongmanmingcheng;
	}
	
	/**
	 * 获取：漫画名称
	 */
	public String getDongmanmingcheng() {
		return dongmanmingcheng;
	}
				
	
	/**
	 * 设置：封面信息
	 */
	 
	public void setFengmianxinxi(String fengmianxinxi) {
		this.fengmianxinxi = fengmianxinxi;
	}
	
	/**
	 * 获取：封面信息
	 */
	public String getFengmianxinxi() {
		return fengmianxinxi;
	}
				
	
	/**
	 * 设置：通知内容
	 */
	 
	public void setTongzhineirong(String tongzhineirong) {
		this.tongzhineirong = tongzhineirong;
	}
	
	/**
	 * 获取：通知内容
	 */
	public String getTongzhineirong() {
		return tongzhineirong;
	}
				
	
	/**
	 * 设置：通知日期
	 */
	 
	public void setTongzhiriqi(Date tongzhiriqi) {
		this.tongzhiriqi = tongzhiriqi;
	}
	
	/**
	 * 获取：通知日期
	 */
	public Date getTongzhiriqi() {
		return tongzhiriqi;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
			
}
