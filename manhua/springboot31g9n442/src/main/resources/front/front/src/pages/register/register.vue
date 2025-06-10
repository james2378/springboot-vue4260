<template>
	<div>

	<div class="container" :style='{"minHeight":"100vh","alignItems":"center","background":"url(http://codegen.caihongy.cn/20231014/825464b6febd4bf2946d4b4b656195e3.jpg)","display":"flex","width":"100%","backgroundSize":"cover","backgroundPosition":"center center","backgroundRepeat":"no-repeat","justifyContent":"center"}'>
        <el-form class='rgs-form' v-if="pageFlag=='security1'" :style='{"padding":"50px 0 20px","boxShadow":"0px 26px 26px -30px #999","margin":"120px auto 60px","borderRadius":"12px","background":"radial-gradient(circle, rgba(245,245,245,1) 0%, rgba(255,255,255,1) 50%, rgba(245,245,245,1) 100%)","width":"35vw","position":"relative","height":"auto"}'>
			<div v-if="true" :style='{"margin":"20px auto 10px","color":"#333","top":"-100px","textAlign":"center","width":"100%","letterSpacing":"4px","lineHeight":"44px","fontSize":"36px","position":"absolute"}'>找回密码</p></div>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' prop="username">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}'>账号：</div>
				<el-input v-model="forgetForm.username" placeholder="请您输入账号" />
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"20px 0px 0 8vw","outline":"none","color":"#fff","borderRadius":"4px","background":"#ff3d00","display":"inline-block","width":"350px","fontSize":"16px","height":"44px"}' type="primary" @click="getSecurity()">下一步</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 20px","margin":"20px 0 20px","color":"#999","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"14px","textDecoration":"none"}' to="/login">已有账户登录</router-link>
        </el-form>
		<el-form class='rgs-form' v-if="pageFlag=='security2'" :style='{"padding":"50px 0 20px","boxShadow":"0px 26px 26px -30px #999","margin":"120px auto 60px","borderRadius":"12px","background":"radial-gradient(circle, rgba(245,245,245,1) 0%, rgba(255,255,255,1) 50%, rgba(245,245,245,1) 100%)","width":"35vw","position":"relative","height":"auto"}'>
			<div v-if="true" :style='{"margin":"20px auto 10px","color":"#333","top":"-100px","textAlign":"center","width":"100%","letterSpacing":"4px","lineHeight":"44px","fontSize":"36px","position":"absolute"}'>找回密码</p></div>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' prop="pquestion">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}'>密保问题：</div>
				<el-input readonly v-model="registerForm.pquestion" placeholder="密保问题" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' prop="myanswer">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}'>密保答案：</div>
				<el-input v-model="registerForm.myanswer" placeholder="请您输入密保答案" />
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"20px 0px 0 8vw","outline":"none","color":"#fff","borderRadius":"4px","background":"#ff3d00","display":"inline-block","width":"350px","fontSize":"16px","height":"44px"}' type="primary" @click="validateSecurity()">下一步</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 20px","margin":"20px 0 20px","color":"#999","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"14px","textDecoration":"none"}' to="/login">已有账户登录</router-link>
		</el-form>
        <el-form class='rgs-form' v-if="pageFlag=='security3'" :style='{"padding":"50px 0 20px","boxShadow":"0px 26px 26px -30px #999","margin":"120px auto 60px","borderRadius":"12px","background":"radial-gradient(circle, rgba(245,245,245,1) 0%, rgba(255,255,255,1) 50%, rgba(245,245,245,1) 100%)","width":"35vw","position":"relative","height":"auto"}'>
			<div v-if="true" :style='{"margin":"20px auto 10px","color":"#333","top":"-100px","textAlign":"center","width":"100%","letterSpacing":"4px","lineHeight":"44px","fontSize":"36px","position":"absolute"}'>找回密码</p></div>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' prop="newpassword">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}'>新密码：</div>
				<el-input v-model="registerForm.newpassword" type="password" placeholder="请您输入新密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' prop="repassword">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}'>确认密码：</div>
				<el-input v-model="registerForm.repassword" type="password" placeholder="请您确认密码" />
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"20px 0px 0 8vw","outline":"none","color":"#fff","borderRadius":"4px","background":"#ff3d00","display":"inline-block","width":"350px","fontSize":"16px","height":"44px"}' type="primary" @click="updatePassword()">修改密码</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 20px","margin":"20px 0 20px","color":"#999","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"14px","textDecoration":"none"}' to="/login">已有账户登录</router-link>
        </el-form>
		<el-form class='rgs-form' v-if="pageFlag=='register'" :style='{"padding":"50px 0 20px","boxShadow":"0px 26px 26px -30px #999","margin":"120px auto 60px","borderRadius":"12px","background":"radial-gradient(circle, rgba(245,245,245,1) 0%, rgba(255,255,255,1) 50%, rgba(245,245,245,1) 100%)","width":"35vw","position":"relative","height":"auto"}' ref="registerForm" :model="registerForm" :rules="rules">
			<div v-if="false" :style='{"width":"100%","margin":"0 0 10px 0","lineHeight":"44px","fontSize":"20px","color":"rgba(64, 158, 255, 1)","textAlign":"center"}'>USER / REGISTER</div>
			<div v-if="true" :style='{"margin":"20px auto 10px","color":"#333","top":"-100px","textAlign":"center","width":"100%","letterSpacing":"4px","lineHeight":"44px","fontSize":"36px","position":"absolute"}'>基于SpringBoot的漫画天堂网注册</p></div>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="yonghuming">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('yonghuming')?'required':''">用户名：</div>
				<el-input v-model="registerForm.yonghuming"  placeholder="请输入用户名" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="mima">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">密码：</div>
				<el-input v-model="registerForm.mima" type="password" placeholder="请输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="mima">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('mima')?'required':''">确认密码：</div>
				<el-input v-model="registerForm.mima2" type="password" placeholder="请再次输入密码" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="xingming">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('xingming')?'required':''">姓名：</div>
				<el-input v-model="registerForm.xingming"  placeholder="请输入姓名" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="xingbie">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('xingbie')?'required':''">性别：</div>
                <el-select v-model="registerForm.xingbie" placeholder="请选择性别" >
                  <el-option
                      v-for="(item,index) in yonghuxingbieOptions"
                      :key="index"
                      :label="item"
                      :value="item">
                  </el-option>
                </el-select>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="touxiang">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('touxiang')?'required':''">头像：</div>
                <file-upload
					tip="点击上传头像"
					action="file/upload"
					:limit="1"
					:multiple="true"
					:fileUrls="registerForm.touxiang?registerForm.touxiang:''"
					@change="yonghutouxiangUploadChange"
				></file-upload>
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="shouji">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('shouji')?'required':''">手机：</div>
				<el-input v-model="registerForm.shouji"  placeholder="请输入手机" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="pquestion">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('pquestion')?'required':''">密保问题：</div>
				<el-input v-model="registerForm.pquestion"  placeholder="请输入密保问题" />
			</el-form-item>
			<el-form-item :style='{"width":"80%","padding":"0","margin":"0 auto 15px","height":"auto"}' v-if="tableName=='yonghu'" prop="panswer">
				<div v-if="true" :style='{"padding":"0 10px","color":"#333","textAlign":"right","background":"none","display":"inline-block","width":"90px","lineHeight":"36px","fontSize":"14px"}' :class="changeRules('panswer')?'required':''">密保答案：</div>
				<el-input v-model="registerForm.panswer"  placeholder="请输入密保答案" />
			</el-form-item>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"20px 0px 0 8vw","outline":"none","color":"#fff","borderRadius":"4px","background":"#ff3d00","display":"inline-block","width":"350px","fontSize":"16px","height":"44px"}' type="primary" @click="submitForm('registerForm')">注册</el-button>
			<el-button :style='{"border":"0","cursor":"pointer","padding":"0 24px","margin":"0px auto 0px","color":"#666","textAlign":"right","display":"none","outline":"none","borderRadius":"4px","background":"none","width":"auto","fontSize":"16px","height":"44px"}' @click="resetForm('registerForm')">重置</el-button>
			<router-link :style='{"cursor":"pointer","padding":"0 20px","margin":"20px 0 20px","color":"#999","textAlign":"center","display":"inline-block","width":"100%","lineHeight":"1","fontSize":"14px","textDecoration":"none"}' to="/login">已有账户登录</router-link>
			<div class="idea1" :style='{"top":"-19px","left":"0","background":"url() no-repeat center top","display":"none","width":"40vw","position":"absolute","height":"66px"}'></div>
			<div class="idea2" :style='{"width":"100%","background":"blue","display":"none","height":"40px"}'></div>
		</el-form>
    </div>
  </div>
</div>
</template>

<script>

export default {
    //数据集合
    data() {
		return {
            pageFlag : '',
			tableName: '',
			registerForm: {},
			forgetForm: {},
			rules: {},
			requiredRules: {},
            yonghuxingbieOptions: [],
		}
    },
	mounted() {
		if(this.$route.query.pageFlag=='register'){
			
			this.tableName = this.$route.query.role;
			if(this.tableName=='yonghu'){
				this.registerForm = {
					yonghuming: '',
					mima: '',
					xingming: '',
					xingbie: '',
					touxiang: '',
					shouji: '',
					pquestion: '',
					panswer: '',
					status: '',
				}
			}
			if ('yonghu' == this.tableName) {
				this.requiredRules.yonghuming = [{ required: true, message: '请输入用户名', trigger: 'blur' }]
			}
			if ('yonghu' == this.tableName) {
				this.requiredRules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }]
			}
			if ('yonghu' == this.tableName) {
				this.requiredRules.xingming = [{ required: true, message: '请输入姓名', trigger: 'blur' }]
			}
		}
	},
    created() {
		this.pageFlag = this.$route.query.pageFlag;
		if(this.$route.query.pageFlag=='register'){
		  if ('yonghu' == this.tableName) {
			this.rules.yonghuming = [{ required: true, message: '请输入用户名', trigger: 'blur' }];
		  }
		  if ('yonghu' == this.tableName) {
			this.rules.mima = [{ required: true, message: '请输入密码', trigger: 'blur' }];
		  }
		  if ('yonghu' == this.tableName) {
			this.rules.xingming = [{ required: true, message: '请输入姓名', trigger: 'blur' }];
		  }
			this.yonghuxingbieOptions = "男,女".split(',');
		  if ('yonghu' == this.tableName) {
			this.rules.shouji = [{ required: true, validator: this.$validate.isMobile, trigger: 'blur' }];
		  }
		  if ('yonghu' == this.tableName) {
			this.rules.status = [{ required: true, validator: this.$validate.isIntNumer, trigger: 'blur' }];
		  }
		}
    },
    //方法集合
    methods: {
		changeRules(name){
			if(this.requiredRules[name]){
				return true
			}
			return false
		},
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
        // 下二随
      yonghutouxiangUploadChange(fileUrls) {
          this.registerForm.touxiang = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");
      },

        // 多级联动参数


//获取密保问题
        getSecurity(){
            this.tableName = 'yonghu'
            if(!this.tableName) {
                this.$message.error("请选择角色");
                return false
            }
            if(!this.forgetForm.username){
                this.$message.error("请输入账号");
                return false
            }
            this.$http({
                url: this.tableName+`/security?username=` + this.forgetForm.username,
                method: "get",
            }).then(({
                data
            }) => {
                if (data.data && data.code === 0) {
                    this.registerForm = data.data;
                    this.pageFlag="security2"
                } else {
                    if(!data.data) {
                        this.$message.error("用户不存在");
                    } else {
                        this.$message.error(data.msg);
                    }
                }
            });
        },
        //验证密保问题
        validateSecurity(){
            let that = this
            if(this.registerForm.panswer!=this.registerForm.myanswer){
                this.$message.error("答案输入不正确");
                return false
            }
            this.$message.success("答案正确");
            setTimeout(()=>{
                this.pageFlag="security3";
            },1000)
        },
        // 修改密码
        updatePassword() {
            if (!this.registerForm.newpassword) {
                this.$message.error("请输入新密码");
                return;
            }
            if (this.registerForm.newpassword != this.registerForm.repassword) {
                this.$message.error("两次密码输入不一致");
                return;
            }
            this.registerForm.mima = this.registerForm.newpassword;
            this.registerForm.password = this.registerForm.newpassword;
            this.$http.post(this.tableName+`/update`, this.registerForm).then(res => {
              if (res.data.code === 0) {
                this.$message({
                    message: "密码修改成功",
                    type: "success",
                    duration: 1500,
                    onClose: () => {
                      this.$router.push('/login');
                    }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
        },
      submitForm(formName) {
        this.$refs[formName].validate((valid) => {
          if (valid) {
            var url=this.tableName+"/register";
				if((!this.registerForm.yonghuming) && `yonghu` == this.tableName){
					this.$message.error(`用户名不能为空`);
					return
				}
               if(`yonghu` == this.tableName && this.registerForm.mima!=this.registerForm.mima2) {
                this.$message.error(`两次密码输入不一致`);
                return
               }
				if((!this.registerForm.mima) && `yonghu` == this.tableName){
					this.$message.error(`密码不能为空`);
					return
				}
				if((!this.registerForm.xingming) && `yonghu` == this.tableName){
					this.$message.error(`姓名不能为空`);
					return
				}
					if(`yonghu` == this.tableName && this.registerForm.shouji &&(!this.$validate.isMobile2(this.registerForm.shouji))){
						this.$message.error(`手机应输入手机格式`);
						return
					}
            this.$http.post(url, this.registerForm).then(res => {
              if (res.data.code === 0) {
                this.$message({
                  message: '注册成功',
                  type: 'success',
                  duration: 1500,
                  onClose: () => {
                    this.$router.push('/login');
                  }
                });
              } else {
                this.$message.error(res.data.msg);
              }
            });
          } else {
            return false;
          }
        });
      },
      resetForm(formName) {
        this.$refs[formName].resetFields();
      }
    }
  }
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.container {
		position: relative;
		background: url(http://codegen.caihongy.cn/20231014/825464b6febd4bf2946d4b4b656195e3.jpg);
		
		.el-input {
		  width: auto;
		}
		
		.el-date-editor.el-input {
			width: auto;
		}
		
		.el-form-item /deep/ .el-form-item__content {
						display: flex;
						width: 100%;
						flex-wrap: wrap;
					}
		
		.rgs-form .el-input /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px;
						outline: none;
						color: #666;
						background: #fff;
						width: 350px;
						font-size: 14px;
						border-color: #ddd;
						border-width: 1px;
						border-style: solid;
						height: 40px;
					}
		
		.rgs-form .el-select /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px;
						outline: none;
						color: #666;
						background: #fff;
						width: auto;
						font-size: 14px;
						border-color: #ddd;
						border-width: 1px;
						border-style: solid;
						min-width: 350px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px 0 30px;
						outline: none;
						color: #666;
						background: #fff;
						width: auto;
						font-size: 14px;
						border-color: #ddd;
						border-width: 1px;
						border-style: solid;
						min-width: 350px;
						height: 40px;
					}
		
		.rgs-form .el-date-editor /deep/ .el-input__inner {
						border-radius: 4px;
						padding: 0 10px 0 30px;
						outline: none;
						color: #666;
						background: #fff;
						width: auto;
						font-size: 14px;
						border-color: #ddd;
						border-width: 1px;
						border-style: solid;
						min-width: 350px;
						height: 40px;
					}
		
		.rgs-form /deep/ .el-upload--picture-card {
			background: transparent;
			border: 0;
			border-radius: 0;
			width: auto;
			height: auto;
			line-height: initial;
			vertical-align: middle;
		}
		
		.rgs-form /deep/ .upload .upload-img {
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #ddd;
		  		  background: #fff;
		  		  width: 150px;
		  		  font-size: 32px;
		  		  border-color: #ddd;
		  		  border-width: 1px;
		  		  line-height: 60px;
		  		  border-style: solid;
		  		  text-align: center;
		  		  height: 60px;
		  		}
		
		.rgs-form /deep/ .el-upload-list .el-upload-list__item {
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #ddd;
		  		  background: #fff;
		  		  width: 150px;
		  		  font-size: 32px;
		  		  border-color: #ddd;
		  		  border-width: 1px;
		  		  line-height: 60px;
		  		  border-style: solid;
		  		  text-align: center;
		  		  height: 60px;
		  		}
		
		.rgs-form /deep/ .el-upload .el-icon-plus {
		  		  cursor: pointer;
		  		  border-radius: 4px;
		  		  color: #ddd;
		  		  background: #fff;
		  		  width: 150px;
		  		  font-size: 32px;
		  		  border-color: #ddd;
		  		  border-width: 1px;
		  		  line-height: 60px;
		  		  border-style: solid;
		  		  text-align: center;
		  		  height: 60px;
		  		}
	}
	.required {
		position: relative;
	}
	.required::after{
				color: red;
				left: 78px;
				position: absolute;
				content: "*";
				order: 2;
			}
</style>
