### 简介

这是一个线上考试及题库管理系统

采用DDD（领域驱动设计）思想，SpringBoot框架

com.example.online_exam_and_question_manage.interface-com.example.online_exam_and_question_manage.application.facade-com.example.online_exam_and_question_manage.application.service
-com.example.online_exam_and_question_manage.domain.user.service-com.example.online_exam_and_question_manage.domain.user.repository.facade
-com.example.online_exam_and_question_manage.domain.user.repository.persistence

### 使用的技术：

JPA  
Spring Boot  
Swagger UI

### Swagger2注解

* @Api：用在请求的类上，表示对类的说明  
  tags="说明该类的作用，可以在UI界面上看到的注解"  
  value="该参数没什么意义，在UI界面上也看到，所以不需要配置"

* @ApiOperation：用在请求的方法上，说明方法的用途、作用  
  value="说明方法的用途、作用"  
  notes="方法的备注说明"

* @ApiImplicitParams：用在请求的方法上，表示一组参数说明  
  @ApiImplicitParam：用在@ApiImplicitParams注解中，指定一个请求参数的各个方面  
  name：参数名  
  value：参数的汉字说明、解释  
  required：参数是否必须传  
  paramType：参数放在哪个地方
    * header --> 请求参数的获取：@RequestHeader
    * query --> 请求参数的获取：@RequestParam
    * path（用于restful接口）--> 请求参数的获取：@PathVariable
    * body（不常用）
    * form（不常用）    
      dataType：参数类型，默认String，其它值dataType="Integer"         
      defaultValue：参数的默认值

* @ApiResponses：用在请求的方法上，表示一组响应
* @ApiResponse：用在@ApiResponses中，一般用于表达一个错误的响应信息  
  code：数字，例如400  
  message：信息，例如"请求参数没填好"  
  response：抛出异常的类

* @ApiModel：用于响应类上，表示一个返回响应数据的信息 （这种一般用在post创建的时候，使用@RequestBody这样的场景， 请求参数无法使用@ApiImplicitParam注解进行描述的时候）
* @ApiModelProperty：用在属性上，描述响应类的属性


* 使用说明（实例）
  https://blog.csdn.net/weixin_44296929/article/details/115310009

### JPA介绍

JPA全称为Java Persistence API ，Java持久化API是Sun公司在java EE
5规范中提出的Java持久化接口。JPA吸取了目前Java持久化技术的优点，旨在规范、简化Java对象的持久化工作。使用JPA持久化对象，并不是依赖于某一个ORM框架。
JPA是目前比较流行的一种ORM技术之一，所以他拥有ORM技术的各种特点，当然他还有自己的一些优势：

1. 标准化  
   JPA 是 JCP 组织发布的Java EE标准之一，因此任何声称符合 JPA 标准的框架都遵循同样的架构，提供相同的访问 API，这保证了基于JPA开发的企业应用能够经过少量的修改就能够在不同的JPA框架下运行。
2. 对容器级特性的支持  
   JPA 框架中支持大数据集、事务、并发等容器级事务，这使得 JPA 超越了简单持久化框架的局限，在企业应用发挥更大的作用。
3. 简单易用，集成方便  
   JPA的主要目标之一就是提供更加简单的编程模型：在JPA框架下创建实体和创建Java 类一样简单，没有任何的约束和限制，只需要使用
   javax.persistence.Entity进行注释；JPA的框架和接口也都非常简单，没有太多特别的规则和设计模式的要求，开发者可以很容易的掌握。JPA基于非侵入式原则设计，因此可以很容易的和其它框架或者容器集成。
4. 可媲美JDBC的查询能力  
   JPA的查询语言是面向对象而非面向数据库的，它以面向对象的自然语法构造查询语句，可以看成是hibernateHQL的等价物。JPA定义了独特的JPQL（Java Persistence Query Language），JPQL是EJB
   QL的一种扩展，它是针对实体的一种查询语言，操作对象是实体，而不是关系数据库的表，而且能够支持批量更新和修改、JOIN、GROUP BY、HAVING 等通常只有 SQL 才能够提供的高级查询特性，甚至还能够支持子查询。
5. 支持面向对象的高级特性  
   JPA 中能够支持面向对象的高级特性，如类之间的继承、多态和类之间的复杂关系，这样的支持能够让开发者最大限度的使用面向对象的模型设计企业应用，而不需要自行处理这些特性在关系数据库的持久化。

Jpa是一种规范，而Hibernate是它的一种实现； 如果hibernate认为JPA的注解够用，就直接用。否则会弄一个自己的出来作为补充； JPA的注解已经是hibernate的核心，hibernate只提供了一些补充。

###### —— 来自 https://www.jianshu.com/p/589f40ecce95

### JPA的实现


