package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 订阅信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
@TableName("dingyuexinxi")
public class DingyuexinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingyuexinxiEntity() {
		
	}
	
	public DingyuexinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
    @TableId(type = IdType.AUTO)
    private Long id;
	/**
	 * 订阅单号
	 */
					
	private String dingyuedanhao;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：订阅单号
	 */
	public void setDingyuedanhao(String dingyuedanhao) {
		this.dingyuedanhao = dingyuedanhao;
	}
	/**
	 * 获取：订阅单号
	 */
	public String getDingyuedanhao() {
		return dingyuedanhao;
	}
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
