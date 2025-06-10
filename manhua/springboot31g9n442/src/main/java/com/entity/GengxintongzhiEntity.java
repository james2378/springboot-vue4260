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
 * 更新通知
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
@TableName("gengxintongzhi")
public class GengxintongzhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public GengxintongzhiEntity() {
		
	}
	
	public GengxintongzhiEntity(T t) {
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
	 * 通知名称
	 */
					
	private String tongzhimingcheng;
	
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
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date tongzhiriqi;
	
	/**
	 * 用户名
	 */
					
	private String yonghuming;
	
	
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
	 * 设置：通知名称
	 */
	public void setTongzhimingcheng(String tongzhimingcheng) {
		this.tongzhimingcheng = tongzhimingcheng;
	}
	/**
	 * 获取：通知名称
	 */
	public String getTongzhimingcheng() {
		return tongzhimingcheng;
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
