package io.github.jwyoon1220.sample

import org.bukkit.plugin.java.JavaPlugin

class Main : JavaPlugin() {

    override fun onEnable() {
        logger.warning("지금은 테스트 버전입니다. 오류가 있을 수 있습니다.")
        logger.warning("오류가 발생한다면 깃버브 \"jwyoon1220\" 에다 아무 레포지트리 에서 이슈로 작성해주세요")
        logger.info("활성화 됨")
        getCommand("test")?.setExecutor(Command())
    }

    override fun onDisable() {

    }

}