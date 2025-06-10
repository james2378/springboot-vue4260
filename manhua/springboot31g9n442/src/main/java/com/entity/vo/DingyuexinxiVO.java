package com.entity.vo;

import com.entity.DingyuexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 订阅信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
public class DingyuexinxiVO  implements Serializable {
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
	 * 订阅日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dingyueriqi;
		
	/**
	 * 信息备注
	 */
	
	private String xinxibeizhu;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 回复内容
	 */
	
	private String shhf;
				
	
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
	 * 设置：订阅日期
	 */
	 
	public void setDingyueriqi(Date dingyueriqi) {
		this.dingyueriqi = dingyueriqi;
	}
	
	/**
	 * 获取：订阅日期
	 */
	public Date getDingyueriqi() {
		return dingyueriqi;
	}
				
	
	/**
	 * 设置：信息备注
	 */
	 
	public void setXinxibeizhu(String xinxibeizhu) {
		this.xinxibeizhu = xinxibeizhu;
	}
	
	/**
	 * 获取：信息备注
	 */
	public String getXinxibeizhu() {
		return xinxibeizhu;
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
				
	
	/**
	 * 设置：回复内容
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：回复内容
	 */
	public String getShhf() {
		return shhf;
	}
			
}
