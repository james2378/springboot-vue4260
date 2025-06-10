import VueRouter from 'vue-router'

//引入组件
import Index from '../pages'
import Home from '../pages/home/home'
import Login from '../pages/login/login'
import Register from '../pages/register/register'
import Center from '../pages/center/center'
import Messages from '../pages/messages/list'
import Forum from '../pages/forum/list'
import ForumAdd from '../pages/forum/add'
import ForumDetail from '../pages/forum/detail'
import MyForumList from '../pages/forum/myForumList'
import Storeup from '../pages/storeup/list'
import News from '../pages/news/news-list'
import NewsDetail from '../pages/news/news-detail'
import payList from '../pages/pay'

import yonghuList from '../pages/yonghu/list'
import yonghuDetail from '../pages/yonghu/detail'
import yonghuAdd from '../pages/yonghu/add'
import dongmanfenleiList from '../pages/dongmanfenlei/list'
import dongmanfenleiDetail from '../pages/dongmanfenlei/detail'
import dongmanfenleiAdd from '../pages/dongmanfenlei/add'
import dongmanxinxiList from '../pages/dongmanxinxi/list'
import dongmanxinxiDetail from '../pages/dongmanxinxi/detail'
import dongmanxinxiAdd from '../pages/dongmanxinxi/add'
import dingyuexinxiList from '../pages/dingyuexinxi/list'
import dingyuexinxiDetail from '../pages/dingyuexinxi/detail'
import dingyuexinxiAdd from '../pages/dingyuexinxi/add'
import gengxintongzhiList from '../pages/gengxintongzhi/list'
import gengxintongzhiDetail from '../pages/gengxintongzhi/detail'
import gengxintongzhiAdd from '../pages/gengxintongzhi/add'
import newstypeList from '../pages/newstype/list'
import newstypeDetail from '../pages/newstype/detail'
import newstypeAdd from '../pages/newstype/add'
import aboutusList from '../pages/aboutus/list'
import aboutusDetail from '../pages/aboutus/detail'
import aboutusAdd from '../pages/aboutus/add'
import systemintroList from '../pages/systemintro/list'
import systemintroDetail from '../pages/systemintro/detail'
import systemintroAdd from '../pages/systemintro/add'
import discussdongmanxinxiList from '../pages/discussdongmanxinxi/list'
import discussdongmanxinxiDetail from '../pages/discussdongmanxinxi/detail'
import discussdongmanxinxiAdd from '../pages/discussdongmanxinxi/add'

const originalPush = VueRouter.prototype.push
VueRouter.prototype.push = function push(location) {
	return originalPush.call(this, location).catch(err => err)
}

//配置路由
export default new VueRouter({
	routes:[
		{
      path: '/',
      redirect: '/index/home'
    },
		{
			path: '/index',
			component: Index,
			children:[
				{
					path: 'home',
					component: Home
				},
				{
					path: 'center',
					component: Center,
				},
				{
					path: 'pay',
					component: payList,
				},
				{
					path: 'messages',
					component: Messages
				},
				{
					path: 'forum',
					component: Forum
				},
				{
					path: 'forumAdd',
					component: ForumAdd
				},
				{
					path: 'forumDetail',
					component: ForumDetail
				},
				{
					path: 'myForumList',
					component: MyForumList
				},
				{
					path: 'storeup',
					component: Storeup
				},
				{
					path: 'news',
					component: News
				},
				{
					path: 'newsDetail',
					component: NewsDetail
				},
				{
					path: 'yonghu',
					component: yonghuList
				},
				{
					path: 'yonghuDetail',
					component: yonghuDetail
				},
				{
					path: 'yonghuAdd',
					component: yonghuAdd
				},
				{
					path: 'dongmanfenlei',
					component: dongmanfenleiList
				},
				{
					path: 'dongmanfenleiDetail',
					component: dongmanfenleiDetail
				},
				{
					path: 'dongmanfenleiAdd',
					component: dongmanfenleiAdd
				},
				{
					path: 'dongmanxinxi',
					component: dongmanxinxiList
				},
				{
					path: 'dongmanxinxiDetail',
					component: dongmanxinxiDetail
				},
				{
					path: 'dongmanxinxiAdd',
					component: dongmanxinxiAdd
				},
				{
					path: 'dingyuexinxi',
					component: dingyuexinxiList
				},
				{
					path: 'dingyuexinxiDetail',
					component: dingyuexinxiDetail
				},
				{
					path: 'dingyuexinxiAdd',
					component: dingyuexinxiAdd
				},
				{
					path: 'gengxintongzhi',
					component: gengxintongzhiList
				},
				{
					path: 'gengxintongzhiDetail',
					component: gengxintongzhiDetail
				},
				{
					path: 'gengxintongzhiAdd',
					component: gengxintongzhiAdd
				},
				{
					path: 'newstype',
					component: newstypeList
				},
				{
					path: 'newstypeDetail',
					component: newstypeDetail
				},
				{
					path: 'newstypeAdd',
					component: newstypeAdd
				},
				{
					path: 'aboutus',
					component: aboutusList
				},
				{
					path: 'aboutusDetail',
					component: aboutusDetail
				},
				{
					path: 'aboutusAdd',
					component: aboutusAdd
				},
				{
					path: 'systemintro',
					component: systemintroList
				},
				{
					path: 'systemintroDetail',
					component: systemintroDetail
				},
				{
					path: 'systemintroAdd',
					component: systemintroAdd
				},
				{
					path: 'discussdongmanxinxi',
					component: discussdongmanxinxiList
				},
				{
					path: 'discussdongmanxinxiDetail',
					component: discussdongmanxinxiDetail
				},
				{
					path: 'discussdongmanxinxiAdd',
					component: discussdongmanxinxiAdd
				},
			]
		},
		{
			path: '/login',
			component: Login
		},
		{
			path: '/register',
			component: Register
		},
	]
})
