<#import "login.ftl" as l>
<#import "common.ftl" as c>

<@c.page>

    <@l.login "/registration" />
    <br>
    ${message}

</@c.page>