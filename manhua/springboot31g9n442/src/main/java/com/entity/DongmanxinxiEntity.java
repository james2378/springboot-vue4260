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
 * 漫画信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
@TableName("dongmanxinxi")
public class DongmanxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DongmanxinxiEntity() {
		
	}
	
	public DongmanxinxiEntity(T t) {
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
	 * 漫画名称
	 */
					
	private String dongmanmingcheng;
	
	/**
	 * 漫画分类
	 */
					
	private String dongmanfenlei;
	
	/**
	 * 封面信息
	 */
					
	private String fengmianxinxi;
	
	/**
	 * 所属地区
	 */
					
	private String suoshudiqu;
	
	/**
	 * 漫画作者
	 */
					
	private String dongmanzuozhe;
	
	/**
	 * 演员信息
	 */
					
	private String yanyuanxinxi;
	
	/**
	 * 发行公司
	 */
					
	private String faxinggongsi;
	
	/**
	 * 发行年份
	 */
					
	private String faxingnianfen;
	
	/**
	 * 故事概要
	 */
					
	private String gushigaiyao;
	
	/**
	 * 漫画视频
	 */
					
	private String dongmanshipin;
	
	/**
	 * 漫画介绍
	 */
					
	private String dongmanjieshao;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 评论数
	 */
					
	private Integer discussnum;
	
	/**
	 * 收藏数
	 */
					
	private Integer storeupnum;
	
	
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
	 * 设置：所属地区
	 */
	public void setSuoshudiqu(String suoshudiqu) {
		this.suoshudiqu = suoshudiqu;
	}
	/**
	 * 获取：所属地区
	 */
	public String getSuoshudiqu() {
		return suoshudiqu;
	}
	/**
	 * 设置：漫画作者
	 */
	public void setDongmanzuozhe(String dongmanzuozhe) {
		this.dongmanzuozhe = dongmanzuozhe;
	}
	/**
	 * 获取：漫画作者
	 */
	public String getDongmanzuozhe() {
		return dongmanzuozhe;
	}
	/**
	 * 设置：演员信息
	 */
	public void setYanyuanxinxi(String yanyuanxinxi) {
		this.yanyuanxinxi = yanyuanxinxi;
	}
	/**
	 * 获取：演员信息
	 */
	public String getYanyuanxinxi() {
		return yanyuanxinxi;
	}
	/**
	 * 设置：发行公司
	 */
	public void setFaxinggongsi(String faxinggongsi) {
		this.faxinggongsi = faxinggongsi;
	}
	/**
	 * 获取：发行公司
	 */
	public String getFaxinggongsi() {
		return faxinggongsi;
	}
	/**
	 * 设置：发行年份
	 */
	public void setFaxingnianfen(String faxingnianfen) {
		this.faxingnianfen = faxingnianfen;
	}
	/**
	 * 获取：发行年份
	 */
	public String getFaxingnianfen() {
		return faxingnianfen;
	}
	/**
	 * 设置：故事概要
	 */
	public void setGushigaiyao(String gushigaiyao) {
		this.gushigaiyao = gushigaiyao;
	}
	/**
	 * 获取：故事概要
	 */
	public String getGushigaiyao() {
		return gushigaiyao;
	}
	/**
	 * 设置：漫画视频
	 */
	public void setDongmanshipin(String dongmanshipin) {
		this.dongmanshipin = dongmanshipin;
	}
	/**
	 * 获取：漫画视频
	 */
	public String getDongmanshipin() {
		return dongmanshipin;
	}
	/**
	 * 设置：漫画介绍
	 */
	public void setDongmanjieshao(String dongmanjieshao) {
		this.dongmanjieshao = dongmanjieshao;
	}
	/**
	 * 获取：漫画介绍
	 */
	public String getDongmanjieshao() {
		return dongmanjieshao;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：评论数
	 */
	public void setDiscussnum(Integer discussnum) {
		this.discussnum = discussnum;
	}
	/**
	 * 获取：评论数
	 */
	public Integer getDiscussnum() {
		return discussnum;
	}
	/**
	 * 设置：收藏数
	 */
	public void setStoreupnum(Integer storeupnum) {
		this.storeupnum = storeupnum;
	}
	/**
	 * 获取：收藏数
	 */
	public Integer getStoreupnum() {
		return storeupnum;
	}

}
