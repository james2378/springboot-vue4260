<template>
<div class="center-preview" :style='{"border":"0px solid #ddd","padding":"0px 0 0","margin":"20px auto","flexWrap":"wrap","background":"#fff","display":"block","width":"80%","position":"relative","justifyContent":"space-between"}'>
	<div class="title" :style='{"padding":"0 24px","margin":"0 0 20px","borderColor":"#fb3f52","color":"#fb3f52","textAlign":"left","background":"url(http://codegen.caihongy.cn/20231014/d40a8eadb6374590871ad91a8ca19cfc.png) no-repeat left bottom","borderWidth":"0 0 0px","width":"100%","fontSize":"22px","lineHeight":"44px","borderStyle":"solid","fontWeight":"600","height":"48px"}'>{{ title }}</div>
	
	<div class="info" :style='{"padding":"0px 20px","boxShadow":"0 0px 0px rgba(0, 0, 0, 0.3)","margin":"40px 0 0 5%","borderColor":"#28890b20","alignItems":"flex-start","display":"flex","float":"right","justifyContent":"space-between","borderRadius":"0px","flexWrap":"wrap","background":"none","borderWidth":"0px","width":"30%","borderStyle":"solid","height":"auto","order":"2"}'>
		<div :style='{"padding":"0px 20px","borderColor":"#eee","margin":"0 0 10px","color":"#333","textAlign":"left","letterSpacing":"3px","borderWidth":"0px","background":"linear-gradient(180deg, rgba(218,254,234,1) 0%, rgba(180,235,204,1) 100%),#b4ebcc","width":"50%","lineHeight":"60px","fontSize":"16px","borderStyle":"solid","fontWeight":"600","height":"60px"}'>个人信息</div>
		<div :style='{"border":"0px solid #eee","borderColor":"#1abc9e20","margin":"0 0 10px","borderWidth":"0 0 0px 0","background":"linear-gradient(180deg, rgba(218,254,234,1) 0%, rgba(180,235,204,1) 100%),#b4ebcc","width":"50%","fontSize":0,"borderStyle":"solid","height":"60px"}' v-if="userTableName=='yonghu'">
			<el-image :style='{"margin":"6px auto","borderColor":"#efefef","objectFit":"cover","borderRadius":"100%","borderWidth":"0 0 1px 0","display":"none","width":"48px","borderStyle":"solid","height":"48px"}' :src="sessionForm.touxiang?baseUrl + sessionForm.touxiang:require('@/assets/avator.png')" fit="cover"></el-image>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#1abc9e20","margin":"0 auto","borderWidth":"0 0 0px 0","display":"flex","width":"100%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"margin":"0 10px 0 0","fontSize":"14px","color":"#333","fontWeight":"600"}'>用户名</div>
			<div :style='{"fontSize":"14px","color":"#999","textAlign":"left","flex":1}'>{{sessionForm.yonghuming}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#1abc9e20","margin":"0 auto","borderWidth":"0 0 0px 0","display":"flex","width":"100%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"margin":"0 10px 0 0","fontSize":"14px","color":"#333","fontWeight":"600"}'>姓名</div>
			<div :style='{"fontSize":"14px","color":"#999","textAlign":"left","flex":1}'>{{sessionForm.xingming}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#1abc9e20","margin":"0 auto","borderWidth":"0 0 0px 0","display":"flex","width":"100%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"margin":"0 10px 0 0","fontSize":"14px","color":"#333","fontWeight":"600"}'>性别</div>
			<div :style='{"fontSize":"14px","color":"#999","textAlign":"left","flex":1}'>{{sessionForm.xingbie}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#1abc9e20","margin":"0 auto","borderWidth":"0 0 0px 0","display":"flex","width":"100%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"margin":"0 10px 0 0","fontSize":"14px","color":"#333","fontWeight":"600"}'>手机</div>
			<div :style='{"fontSize":"14px","color":"#999","textAlign":"left","flex":1}'>{{sessionForm.shouji}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#1abc9e20","margin":"0 auto","borderWidth":"0 0 0px 0","display":"flex","width":"100%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"margin":"0 10px 0 0","fontSize":"14px","color":"#333","fontWeight":"600"}'>密保问题</div>
			<div :style='{"fontSize":"14px","color":"#999","textAlign":"left","flex":1}'>{{sessionForm.pquestion}}</div>
		</div>
		<div :style='{"padding":"0 20px","borderColor":"#1abc9e20","margin":"0 auto","borderWidth":"0 0 0px 0","display":"flex","width":"100%","lineHeight":"40px","borderStyle":"solid","height":"auto"}' v-if="userTableName=='yonghu'">
			<span class="icon iconfont icon-shouye-zhihui" :style='{"padding":"0 5px","fontSize":"14px","color":"#333","display":"none"}'></span>
			<div :style='{"margin":"0 10px 0 0","fontSize":"14px","color":"#333","fontWeight":"600"}'>密保答案</div>
			<div :style='{"fontSize":"14px","color":"#999","textAlign":"left","flex":1}'>{{sessionForm.panswer}}</div>
		</div>
		
	</div>
	
    <el-tabs tab-position="left" :style='{"padding":"0 20px 40px","margin":"40px 0 0","flexWrap":"wrap","background":"#fff","flex":"1","display":"flex","width":"65%","float":"left","order":"1"}' @tab-click="handleClick">
      <el-tab-pane label="个人中心">
        <el-form class="center-preview-pv" ref="sessionForm" :model="sessionForm" :rules="rules" label-width="100px">
          <el-form-item :style='{"width":"auto","padding":"0px","margin":"0 0 40px","background":"#fff","display":"inline-block"}' v-if="userTableName=='yonghu'" label="用户名" prop="yonghuming">
            <el-input v-model="sessionForm.yonghuming" placeholder="用户名" readonly></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"auto","padding":"0px","margin":"0 0 40px","background":"#fff","display":"inline-block"}' v-if="userTableName=='yonghu'" label="密码" prop="mima">
            <el-input type="password" v-model="sessionForm.mima" placeholder="密码"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"auto","padding":"0px","margin":"0 0 40px","background":"#fff","display":"inline-block"}' v-if="userTableName=='yonghu'" label="姓名" prop="xingming">
            <el-input v-model="sessionForm.xingming" placeholder="姓名" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"auto","padding":"0px","margin":"0 0 40px","background":"#fff","display":"inline-block"}' v-if="userTableName=='yonghu'" label="性别">
            <el-select v-model="sessionForm.xingbie" placeholder="请选择性别" >
              <el-option v-for="(item, index) in dynamicProp.xingbie" :key="index" :label="item" :value="item"></el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"auto","padding":"0px","margin":"0 0 40px","background":"#fff","display":"inline-block"}' v-if="userTableName=='yonghu'" label="头像">
			<file-upload
			tip="点击上传头像"
			action="file/upload"
			:limit="1"
			:multiple="true"
			:fileUrls="sessionForm.touxiang?sessionForm.touxiang:''"
			@change="yonghutouxiangHandleAvatarSuccess"
			></file-upload>
          </el-form-item>
          <el-form-item :style='{"width":"auto","padding":"0px","margin":"0 0 40px","background":"#fff","display":"inline-block"}' v-if="userTableName=='yonghu'" label="手机" prop="shouji">
            <el-input v-model="sessionForm.shouji" placeholder="手机" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"auto","padding":"0px","margin":"0 0 40px","background":"#fff","display":"inline-block"}' v-if="userTableName=='yonghu'" label="密保问题" prop="pquestion">
            <el-input v-model="sessionForm.pquestion" placeholder="密保问题" ></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"auto","padding":"0px","margin":"0 0 40px","background":"#fff","display":"inline-block"}' v-if="userTableName=='yonghu'" label="密保答案" prop="panswer">
            <el-input v-model="sessionForm.panswer" placeholder="密保答案" ></el-input>
          </el-form-item>
          <el-form-item :style='{"padding":"0","margin":"0"}'>
            <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"#333","borderRadius":"0px","background":"#b4ebcc","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}' type="primary" @click="onSubmit('sessionForm')">更新信息</el-button>
            <el-button :style='{"border":"1px solid #eee","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#333","borderRadius":"0px","background":"none","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}' type="danger" @click="logout">退出登录</el-button>
          </el-form-item>
        </el-form>
      </el-tab-pane>
		<el-tab-pane v-for="(item,index) in menuList" :key="index" v-if="hasBack(item.menu)" :label="item.child[0].menu" :name="item.child[0].tableName"></el-tab-pane>
	  
      <el-tab-pane label="我的发布"></el-tab-pane>
      <el-tab-pane label="我的收藏"></el-tab-pane>
    </el-tabs>
</div>
</template>

<script>
  import config from '@/config/config'
  import menu from '@/config/menu'
  import Vue from 'vue'
  export default {
    //数据集合
    data() {
      return {
        title: '个人中心',
        baseUrl: config.baseUrl,
        sessionForm: {},
        rules: {},
		menuList: [],
        disabled: false,
        uploadUrl: config.baseUrl + 'file/upload',
        imageUrl: '',
        headers: {Token: localStorage.getItem('Token')},
        userTableName: localStorage.getItem('UserTableName'),
        dynamicProp: {},
      }
    },
    created() {
		let menus = menu.list()
		for(let x in menus){
			if(menus[x].tableName == this.userTableName){
				this.menuList = menus[x].backMenu
			}
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'yonghuming', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'mima', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'xingming', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'xingbie', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'touxiang', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'shouji', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'pquestion', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'panswer', null);
		}
		if ('yonghu' == this.userTableName) {
			this.$set(this.sessionForm, 'status', null);
		}

      if ('yonghu' == this.userTableName) {
        this.$set(this.rules, 'yonghuming', [{ required: true, message: '请输入用户名', trigger: 'blur' }]);
      }
      if ('yonghu' == this.userTableName) {
        this.$set(this.rules, 'mima', [{ required: true, message: '请输入密码', trigger: 'blur' }]);
      }
      if ('yonghu' == this.userTableName) {
        this.$set(this.rules, 'xingming', [{ required: true, message: '请输入姓名', trigger: 'blur' }]);
      }
			if ('yonghu' == this.userTableName) {
        this.$set(this.rules, 'shouji', [{ required: false, validator: this.$validate.isMobile, trigger: 'blur' }]);
      }
			if ('yonghu' == this.userTableName) {
        this.$set(this.rules, 'status', [{ required: false, validator: this.$validate.isIntNumer, trigger: 'blur' }]);
      }

      this.init();
      this.sessionForm = JSON.parse(localStorage.getItem('sessionForm'))
    },
    //方法集合
    methods: {
      init() {
        if ('yonghu' == this.userTableName) {
          this.dynamicProp.xingbie = '男,女'.split(',');
        }
      },
	  setSession(){
		  localStorage.setItem('sessionForm',JSON.stringify(this.sessionForm))
	  },
      onSubmit(formName) {
		if(`yonghu` == this.userTableName && this.sessionForm.touxiang!=null){
			this.sessionForm.touxiang = this.sessionForm.touxiang.replace(new RegExp(this.$config.baseUrl,"g"),"");
		}
        this.$refs[formName].validate((valid) => {
			if (valid) {
				this.$http.post(this.userTableName + '/update', this.sessionForm).then(res => {
					if (res.data.code == 0) {
						this.setSession()
						this.$message({
							message: '更新成功',
							type: 'success',
							duration: 1500
						});
					}
				});
			} else {
				return false;
			}
        });
      },
      yonghutouxiangHandleAvatarSuccess(fileUrls) {
        this.sessionForm.touxiang = fileUrls;
      },
      handleClick(tab, event) {
        switch(event.target.outerText) {
          case '个人中心':
            tab.$router.push('/index/center');
            break;
          case '我的发布':
            tab.$router.push('/index/myForumList');
            break;
          case '我的收藏':
            localStorage.setItem('storeupType', 1);
            tab.$router.push('/index/storeup');
            break;
		  default:
		  	tab.$router.push(`/index/${tab.name}?centerType=1`);
        }

        this.title = event.target.outerText;
      },
      logout() {
        localStorage.clear();
        Vue.http.headers.common['Token'] = "";
        this.$router.push('/index/home');
        this.activeIndex = '0'
        localStorage.setItem('keyPath', this.activeIndex)
        this.$forceUpdate()
        this.$message({
            message: '登出成功',
            type: 'success',
            duration: 1500,
        });
      },
	  hasBack(name){
		  switch(name){
			case '我的收藏管理':
				return false
				break;
			default:
				return true
		  }
	  }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
  .center-preview {
  
    .el-tabs {
      & /deep/ .el-tabs__header {
        .el-tabs__nav-wrap {
          margin: 0;
  
          &::after {
            content: none;
          }
        }
  
        .el-tabs__active-bar {
          display: none !important;
        }
      }
  
      .center-preview-pv {
        .el-date-editor.el-input {
          width: auto;
        }
  
        .balance {
          .el-input {
            width: auto;
          }
        }
      }
    }
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header {
	padding: 0;
	margin: 0;
	background: #fff;
	width: 100%;
	border-color: #ea0012;
	border-width: 0 0 0px;
	position: relative;
	float: left;
	border-style: solid;
	height: auto;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item {
  	padding: 0 16px;
  	margin: 0;
  	color: #666;
  	font-weight: 500;
  	display: block;
  	font-size: 16px;
  	border-color: #fff;
  	line-height: 44px;
  	float: left;
  	background: none;
  	width: auto;
  	border-width: 0 0 4px;
  	position: relative;
  	border-style: solid;
  	text-align: center;
  	height: 48px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item:hover {
  	padding: 0 16px;
  	color: #fb3f52;
  	background: none;
  	font-weight: 500;
  	font-size: 16px;
  	border-color: #fb3f52;
  	border-width: 0 0 4px;
  	line-height: 44px;
  	position: relative;
  	border-style: solid;
  	text-align: center;
  	height: 48px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__header .el-tabs__item.is-active {
  	padding: 0 16px;
  	margin: 0;
  	color: #e60012;
  	font-weight: 500;
  	display: block;
  	font-size: 16px;
  	border-color: #fb3f52;
  	line-height: 44px;
  	float: left;
  	background: none;
  	width: auto;
  	border-width: 0 0 4px;
  	position: relative;
  	border-style: solid;
  	text-align: center;
  	height: 48px;
  }
  
  .center-preview .el-tabs /deep/ .el-tabs__content .el-tab-pane {
  	padding: 0px;
  	margin: 40px 0 0;
  	background: #fff;
  	width: 100%;
  }
  
  .center-preview-pv .el-form-item /deep/ .el-form-item__label {
  	padding: 0 10px 0 0;
  	color: #666;
  	font-weight: 500;
  	width: 100px;
  	font-size: 14px;
  	line-height: 40px;
  	text-align: right;
  }
  
  .center-preview-pv .el-form-item .el-form-item__content {
    margin-left: 100px;
  }
  
  .center-preview-pv .el-input /deep/ .el-input__inner {
  	border-radius: 0px;
  	padding: 0 12px;
  	box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  	outline: none;
  	color: #666;
  	width: auto;
  	font-size: 14px;
  	border-color: #ddd;
  	border-width: 0 0 1px;
  	border-style: solid;
  	min-width: 150px;
  	height: 40px;
  }
  
  .center-preview-pv .el-select /deep/ .el-input__inner {
  	border-radius: 0px;
  	padding: 0 12px;
  	box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  	outline: none;
  	color: #666;
  	width: auto;
  	font-size: 14px;
  	border-color: #ddd;
  	border-width: 0 0 1px;
  	border-style: solid;
  	min-width: 150px;
  	height: 40px;
  }
  
  .center-preview-pv .el-date-editor /deep/ .el-input__inner {
  	border-radius: 0px;
  	padding: 0 10px 0 30px;
  	box-shadow: 0 0 0px rgba(64, 158, 255, .5);
  	outline: none;
  	color: #666;
  	width: 200px;
  	font-size: 14px;
  	border-color: #ddd;
  	border-width: 0 0 1px;
  	border-style: solid;
  	height: 40px;
  }
  
  .center-preview-pv /deep/ .avatar-uploader-icon {
  	cursor: pointer;
  	border-radius: 2px;
  	color: #999;
  	width: 150px;
  	font-size: 24px;
  	border-color: #ddd;
  	border-width: 0 0 1px;
  	line-height: 44px;
  	border-style: solid;
  	text-align: center;
  	height: 44px;
  }
  
  .center-preview-pv .el-form-item.balance /deep/ .el-input__inner {
  	border-radius: 0px;
  	padding: 0 12px;
  	color: #666;
  	display: inline-block;
  	width: 200px;
  	font-size: 14px;
  	border-color: #ddd;
  	border-width: 0 0 1px;
  	border-style: solid;
  	height: 36px;
  }
</style>
