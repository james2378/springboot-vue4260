const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot31g9n442/",
            name: "springboot31g9n442",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot31g9n442/front/dist/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "基于SpringBoot的漫画天堂网"
        } 
    }
}
export default base
