package com.entity.model;

import com.entity.DongmanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 漫画信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-12-05 20:50:09
 */
public class DongmanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
