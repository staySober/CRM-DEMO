# zjs_bos

  本项目为**用友公司**开发的宅急送bos系统 项目的需求文档为该公司设计，代码由本人code用来学习。
  
  内部调用的另外一个项目crm系统 会在我的下一个项目中发布。其中调用了crm中提供的一些外部调用接口。
  本项目为Demo，仅供学习参考。
  
  ***
### 项目使用的技术概述
 ```
 本项目采用的框架为SSH框架 前端的jsp页面用到了easyui,ajax,jquery
 后端 抽取出了baseDao,baseAction以保证代码的通用性,在业务逻辑上,物流的运输流程采用的是Activiti工作流框架,而在
 用户权限的管理上使用的是shiro框架。
 ```
