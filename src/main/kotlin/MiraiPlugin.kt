package com.mirai

import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin

import net.mamoe.mirai.event.events.FriendMessageEvent
import net.mamoe.mirai.event.events.GroupMessageEvent
import net.mamoe.mirai.event.globalEventChannel


object MiraiPlugin : KotlinPlugin(
    JvmPluginDescription(
        id = "com.mirai.plugin（记得更改此处的插件id以及各种关于插件id的配置）",
        name = "插件名在这里写！！",
        version = "1.0.0",
    )
) {

    override fun onEnable() {
        //监听群消息
        globalEventChannel().subscribeAlways<GroupMessageEvent> {

        }

        //监听私聊消息
        globalEventChannel().subscribeAlways<FriendMessageEvent> {

        }
    }

}



