<template>
<div :style='{"width":"100%","padding":"30px 10% 40px","margin":"0px auto","position":"relative","background":"#fff"}'>
    <el-form
	  :style='{"border":"0px solid #e9e9e9","width":"100%","padding":"0px","margin":"0px 0","position":"relative","background":"#fff"}'
      class="add-update-preview"
      ref="ruleForm"
      :model="ruleForm"
      :rules="rules"
      label-width="120px"
    >
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="漫画名称" prop="dongmanmingcheng">
            <el-input  v-model="ruleForm.dongmanmingcheng" 
                placeholder="漫画名称" clearable :readonly=" false  ||ro.dongmanmingcheng"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}'  label="漫画分类" prop="dongmanfenlei">
            <el-select v-model="ruleForm.dongmanfenlei" placeholder="请选择漫画分类"  >
              <el-option
                  v-for="(item,index) in dongmanfenleiOptions"
                  :key="index"
                  :label="item"
                  :value="item">
              </el-option>
            </el-select>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="封面信息" v-if="type!='cross' || (type=='cross' && !ro.fengmianxinxi)" prop="fengmianxinxi">
            <file-upload
            tip="点击上传封面信息"
            action="file/upload"
            :limit="3"
            :multiple="true"
            :fileUrls="ruleForm.fengmianxinxi?ruleForm.fengmianxinxi:''"
            @change="fengmianxinxiUploadChange"
            ></file-upload>
          </el-form-item>
            <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="封面信息" prop="fengmianxinxi">
                <img v-if="ruleForm.fengmianxinxi.substring(0,4)=='http'" class="upload-img" style="margin-right:20px;" v-bind:key="index" :src="ruleForm.fengmianxinxi.split(',')[0]" width="100" height="100">
                <img v-else class="upload-img" style="margin-right:20px;" v-bind:key="index" v-for="(item,index) in ruleForm.fengmianxinxi.split(',')" :src="baseUrl+item" width="100" height="100">
            </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="所属地区" prop="suoshudiqu">
            <el-input  v-model="ruleForm.suoshudiqu" 
                placeholder="所属地区" clearable :readonly=" false  ||ro.suoshudiqu"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="漫画作者" prop="dongmanzuozhe">
            <el-input  v-model="ruleForm.dongmanzuozhe" 
                placeholder="漫画作者" clearable :readonly=" false  ||ro.dongmanzuozhe"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="演员信息" prop="yanyuanxinxi">
            <el-input  v-model="ruleForm.yanyuanxinxi" 
                placeholder="演员信息" clearable :readonly=" false  ||ro.yanyuanxinxi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="发行公司" prop="faxinggongsi">
            <el-input  v-model="ruleForm.faxinggongsi" 
                placeholder="发行公司" clearable :readonly=" false  ||ro.faxinggongsi"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="发行年份" prop="faxingnianfen">
            <el-input  v-model="ruleForm.faxingnianfen" 
                placeholder="发行年份" clearable :readonly=" false  ||ro.faxingnianfen"></el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="漫画视频" v-if="type!='cross' || (type=='cross' && !ro.dongmanshipin)" prop="dongmanshipin">
            <file-upload
            tip="点击上传漫画视频"
            action="file/upload"
            :limit="1"
            :multiple="true"
            :fileUrls="ruleForm.dongmanshipin?ruleForm.dongmanshipin:''"
            @change="dongmanshipinUploadChange"
            ></file-upload>
          </el-form-item>
		  <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' class="upload" v-else label="漫画视频" prop="dongmanshipin">
			<el-button v-if="ruleForm.dongmanshipin" @click="download(baseUrl + ruleForm.dongmanshipin)" type="success">预览</el-button>
			<el-button v-else disabled>暂无</el-button>
		  </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="故事概要" prop="gushigaiyao">
            <el-input
              type="textarea"
              :rows="8"
              placeholder="故事概要"
              v-model="ruleForm.gushigaiyao">
            </el-input>
          </el-form-item>
          <el-form-item :style='{"width":"100%","padding":"10px","margin":"0 0 10px","background":"none","display":"inline-block"}' label="漫画介绍" prop="dongmanjieshao">
            <editor 
                :style='{"minHeight":"250px","padding":"0","margin":"0","borderColor":"#eee","backgroundColor":"none","borderRadius":"0","borderWidth":"1px","width":"80%","borderStyle":"solid","height":"auto"}'
                v-model="ruleForm.dongmanjieshao" 
                class="editor" 
                action="file/upload">
            </editor>
          </el-form-item>

      <el-form-item :style='{"padding":"0","margin":"0"}'>
        <el-button :style='{"border":"0","cursor":"pointer","padding":"0","margin":"0 20px 0 0","outline":"none","color":"#333","borderRadius":"0px","background":"#b4ebcc","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}'  type="primary" @click="onSubmit">提交</el-button>
        <el-button :style='{"border":"1px solid #eee","cursor":"pointer","padding":"0","margin":"0","outline":"none","color":"#333","borderRadius":"0px","background":"none","width":"100px","lineHeight":"36px","fontSize":"14px","height":"36px"}' @click="back()">返回</el-button>
      </el-form-item>
    </el-form>
</div>
</template>

<script>
  export default {
    data() {
      return {
        id: '',
        baseUrl: '',
        ro:{
            dongmanmingcheng : false,
            dongmanfenlei : false,
            fengmianxinxi : false,
            suoshudiqu : false,
            dongmanzuozhe : false,
            yanyuanxinxi : false,
            faxinggongsi : false,
            faxingnianfen : false,
            gushigaiyao : false,
            dongmanshipin : false,
            dongmanjieshao : false,
            clicktime : false,
            discussnum : false,
            storeupnum : false,
        },
        type: '',
        userTableName: localStorage.getItem('UserTableName'),
        ruleForm: {
          dongmanmingcheng: '',
          dongmanfenlei: '',
          fengmianxinxi: '',
          suoshudiqu: '',
          dongmanzuozhe: '',
          yanyuanxinxi: '',
          faxinggongsi: '',
          faxingnianfen: '',
          gushigaiyao: '',
          dongmanshipin: '',
          dongmanjieshao: '',
          clicktime: '',
          discussnum: '',
          storeupnum: '',
        },
        dongmanfenleiOptions: [],


        rules: {
          dongmanmingcheng: [
            { required: true, message: '漫画名称不能为空', trigger: 'blur' },
          ],
          dongmanfenlei: [
            { required: true, message: '漫画分类不能为空', trigger: 'blur' },
          ],
          fengmianxinxi: [
          ],
          suoshudiqu: [
          ],
          dongmanzuozhe: [
          ],
          yanyuanxinxi: [
          ],
          faxinggongsi: [
          ],
          faxingnianfen: [
          ],
          gushigaiyao: [
          ],
          dongmanshipin: [
          ],
          dongmanjieshao: [
          ],
          clicktime: [
          ],
          discussnum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
          storeupnum: [
            { validator: this.$validate.isIntNumer, trigger: 'blur' },
          ],
        },
		centerType: false,
      };
    },
    computed: {



    },
    components: {
    },
    created() {
		if(this.$route.query.centerType){
			this.centerType = true
		}
	  //this.bg();
      let type = this.$route.query.type ? this.$route.query.type : '';
      this.init(type);
      this.baseUrl = this.$config.baseUrl;
    },
    methods: {
      getMakeZero(s) {
          return s < 10 ? '0' + s : s;
      },
      // 下载
      download(file){
        window.open(`${file}`)
      },
      // 初始化
      init(type) {
        this.type = type;
        if(type=='cross'){
          var obj = JSON.parse(localStorage.getItem('crossObj'));
          for (var o in obj){
            if(o=='dongmanmingcheng'){
              this.ruleForm.dongmanmingcheng = obj[o];
              this.ro.dongmanmingcheng = true;
              continue;
            }
            if(o=='dongmanfenlei'){
              this.ruleForm.dongmanfenlei = obj[o];
              this.ro.dongmanfenlei = true;
              continue;
            }
            if(o=='fengmianxinxi'){
              this.ruleForm.fengmianxinxi = obj[o].split(",")[0];
              this.ro.fengmianxinxi = true;
              continue;
            }
            if(o=='suoshudiqu'){
              this.ruleForm.suoshudiqu = obj[o];
              this.ro.suoshudiqu = true;
              continue;
            }
            if(o=='dongmanzuozhe'){
              this.ruleForm.dongmanzuozhe = obj[o];
              this.ro.dongmanzuozhe = true;
              continue;
            }
            if(o=='yanyuanxinxi'){
              this.ruleForm.yanyuanxinxi = obj[o];
              this.ro.yanyuanxinxi = true;
              continue;
            }
            if(o=='faxinggongsi'){
              this.ruleForm.faxinggongsi = obj[o];
              this.ro.faxinggongsi = true;
              continue;
            }
            if(o=='faxingnianfen'){
              this.ruleForm.faxingnianfen = obj[o];
              this.ro.faxingnianfen = true;
              continue;
            }
            if(o=='gushigaiyao'){
              this.ruleForm.gushigaiyao = obj[o];
              this.ro.gushigaiyao = true;
              continue;
            }
            if(o=='dongmanshipin'){
              this.ruleForm.dongmanshipin = obj[o];
              this.ro.dongmanshipin = true;
              continue;
            }
            if(o=='dongmanjieshao'){
              this.ruleForm.dongmanjieshao = obj[o];
              this.ro.dongmanjieshao = true;
              continue;
            }
            if(o=='clicktime'){
              this.ruleForm.clicktime = obj[o];
              this.ro.clicktime = true;
              continue;
            }
            if(o=='discussnum'){
              this.ruleForm.discussnum = obj[o];
              this.ro.discussnum = true;
              continue;
            }
            if(o=='storeupnum'){
              this.ruleForm.storeupnum = obj[o];
              this.ro.storeupnum = true;
              continue;
            }
          }
        }else if(type=='edit'){
			this.info()
		}
        // 获取用户信息
        this.$http.get(this.userTableName + '/session', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            var json = res.data.data;
          }
        });
        this.$http.get('option/dongmanfenlei/dongmanfenlei', {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.dongmanfenleiOptions = res.data.data;
          }
        });
      },

    // 多级联动参数
      // 多级联动参数
      info() {
        this.$http.get(`dongmanxinxi/detail/${this.$route.query.id}`, {emulateJSON: true}).then(res => {
          if (res.data.code == 0) {
            this.ruleForm = res.data.data;
          }
        });
      },
      // 提交
      onSubmit() {

        //更新跨表属性
        var crossuserid;
        var crossrefid;
        var crossoptnum;
        this.$refs["ruleForm"].validate(valid => {
          if(valid) {
            if(this.type=='cross'){
                 var statusColumnName = localStorage.getItem('statusColumnName');
                 var statusColumnValue = localStorage.getItem('statusColumnValue');
                 if(statusColumnName && statusColumnName!='') {
                     var obj = JSON.parse(localStorage.getItem('crossObj'));
                     if(!statusColumnName.startsWith("[")) {
                         for (var o in obj){
                             if(o==statusColumnName){
                                 obj[o] = statusColumnValue;
                             }
                         }
                         var table = localStorage.getItem('crossTable');
                         this.$http.post(table+'/update', obj).then(res => {});
                     } else {
                            crossuserid=Number(localStorage.getItem('userid'));
                            crossrefid=obj['id'];
                            crossoptnum=localStorage.getItem('statusColumnName');
                            crossoptnum=crossoptnum.replace(/\[/,"").replace(/\]/,"");
                     }
                 }
            }
            if(crossrefid && crossuserid) {
                 this.ruleForm.crossuserid=crossuserid;
                 this.ruleForm.crossrefid=crossrefid;
                 var params = {
                     page: 1,
                     limit: 10,
                     crossuserid:crossuserid,
                     crossrefid:crossrefid,
                 }
                 this.$http.get('dongmanxinxi/list', {
                  params: params
                 }).then(res => {
                     if(res.data.data.total>=crossoptnum) {
                         this.$message({
                          message: localStorage.getItem('tips'),
                          type: 'success',
                          duration: 1500,
                         });
                          return false;
                     } else {
                         // 跨表计算


                          this.$http.post(`dongmanxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
                              if (res.data.code == 0) {
                                  this.$message({
                                      message: '操作成功',
                                      type: 'success',
                                      duration: 1500,
                                      onClose: () => {
                                          this.$router.go(-1);
                                      }
                                  });
                              } else {
                                  this.$message({
                                      message: res.data.msg,
                                      type: 'error',
                                      duration: 1500
                                  });
                              }
                          });
                     }
                 });
             } else {


                  this.$http.post(`dongmanxinxi/${this.ruleForm.id?'update':this.centerType?'save':'add'}`, this.ruleForm).then(res => {
                     if (res.data.code == 0) {
                          this.$message({
                              message: '操作成功',
                              type: 'success',
                              duration: 1500,
                              onClose: () => {
                                  this.$router.go(-1);
                              }
                          });
                      } else {
                          this.$message({
                              message: res.data.msg,
                              type: 'error',
                              duration: 1500
                          });
                      }
                  });
             }
          }
        });
      },
      // 获取uuid
      getUUID () {
        return new Date().getTime();
      },
      // 返回
      back() {
        this.$router.go(-1);
      },
      fengmianxinxiUploadChange(fileUrls) {
          this.ruleForm.fengmianxinxi = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
      dongmanshipinUploadChange(fileUrls) {
          this.ruleForm.dongmanshipin = fileUrls.replace(new RegExp(this.$config.baseUrl,"g"),"");;
      },
    }
  };
</script>

<style rel="stylesheet/scss" lang="scss" scoped>
	.el-date-editor.el-input {
		width: auto;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__label {
	  padding: 0 10px 0 0;
	  color: #666;
	  font-weight: 500;
	  width: 120px;
	  font-size: 14px;
	  line-height: 40px;
	  text-align: right;
	}
	
	.add-update-preview .el-form-item /deep/ .el-form-item__content {
	  margin-left: 120px;
	}
	
	.add-update-preview .el-input /deep/ .el-input__inner {
	  padding: 0 12px;
	  color: #666;
	  font-size: 14px;
	  border-color: #ddd;
	  border-radius: 0px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview .el-select /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview .el-date-editor /deep/ .el-input__inner {
	  border-radius: 0px;
	  padding: 0 10px 0 30px;
	  color: #666;
	  background: none;
	  width: auto;
	  font-size: 14px;
	  border-color: #ddd;
	  border-width: 0 0 1px;
	  border-style: solid;
	  min-width: 300px;
	  height: 40px;
	}
	
	.add-update-preview /deep/ .el-upload--picture-card {
		background: transparent;
		border: 0;
		border-radius: 0;
		width: auto;
		height: auto;
		line-height: initial;
		vertical-align: middle;
	}
	
	.add-update-preview /deep/ .upload .upload-img {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview /deep/ .el-upload-list .el-upload-list__item {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview /deep/ .el-upload .el-icon-plus {
	  cursor: pointer;
	  color: #999;
	  font-size: 24px;
	  border-color: #ddd;
	  line-height: 54px;
	  border-radius: 2px;
	  background: none;
	  width: auto;
	  border-width: 0 0 1px;
	  border-style: solid;
	  text-align: center;
	  min-width: 300px;
	  height: 54px;
	}
	
	.add-update-preview .el-textarea /deep/ .el-textarea__inner {
	  border: 1px solid #ddd;
	  border-radius: 0px;
	  padding: 12px;
	  box-shadow: 0 0 0px rgba(64, 158, 255, .5);
	  outline: none;
	  color: #666;
	  background: none;
	  width: 600px;
	  font-size: 14px;
	  height: 120px;
	}
</style>
