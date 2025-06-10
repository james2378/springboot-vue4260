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
 * 漫画分类
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
@TableName("dongmanfenlei")
public class DongmanfenleiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DongmanfenleiEntity() {
		
	}
	
	public DongmanfenleiEntity(T t) {
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
	 * 漫画分类
	 */
					
	private String dongmanfenlei;
	
	/**
	 * image
	 */
					
	private String image;
	
	
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
	 * 设置：漫画分类
	 */
	public void setDongmanfenlei(String dongmanfenlei) {
		this.dongmanfenlei = dongmanfenlei;
	}
	/**
	 * 获取：漫画分类
	 */
	public String getDongmanfenlei() {
		return dongmanfenlei;
	}
	/**
	 * 设置：image
	 */
	public void setImage(String image) {
		this.image = image;
	}
	/**
	 * 获取：image
	 */
	public String getImage() {
		return image;
	}

}
