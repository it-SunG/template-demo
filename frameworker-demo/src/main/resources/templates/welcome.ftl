<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
</head>
<body>

<#-- 这里是注释 -->
<p> Hello ${info} </p>
<br>

<#--定义变量-->
<#assign info1 = ' how are you?'>
<#--字符串的拼接方式-->
<p> Hello ${info + info1} </p>

<#--字符串的内嵌函数-->
<p> ${info1?substring(1,4)} </p>

<p> ${info1?length}</p>

<#--if标签的使用-->
<#assign num = 666>
<#if num == 666>
    <p>666</p>
<#elseif num == 888>
    <p>888</p>
<#else>
    <p>000</p>
</#if>

<br>
<#--switch标签的使用-->
<#--<#switch num>-->
<#--<#case 666>-->
<#--<p>666</p>-->
<#--<#break>-->
<#--<#case 888>-->
<#--<p>888</p>-->
<#--<#break>-->
<#--<#default>-->
<#--<p>000</p>-->
<#--</#switch>-->

<#--list的使用-->
<h5>无序数组</h5>
<#assign myList = [2,3,7,5,10,9]>
<#list myList as item>
    ${item}
</#list>

<br>
<h5>有序数组</h5>
<#list myList?sort as item>
    ${item}
</#list>


<br>
<#list [1,2,3] as item>
${item}
</#list>

<br>
<#list 1..3 as item>
${item}
</#list>

<br>
<#--元素的别名 缀上 _index  代表下标-->
<#list 1..3 as item>
${item_index},${item} <br>
</#list>

<br>
<#list 1..3 as item>
<#if item_has_next> ${item} </#if>
</#list>

<br>
<#list 1..3 as item>
${item}
<#if item == 1> <#break> </#if>
</#list>

<br>
<#--判断变量是否为空-->
<#--<#assign str = 'str'>-->
${str!'default'}

<br>
<#--引入其他文件中变量的方法  不只可以读取  还可以修改-->
<#import "other.ftl" as otherFtl>
${otherFtl.name} <br>

<#-- in otherFtl ： 必须指定 name 是 otherFtl 中的name-->
<#assign name = 'welcome ftl is here' in otherFtl>
${otherFtl.name} <br>

</body>
</html>