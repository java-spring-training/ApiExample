package example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("wordpress")
public class WordPressProperties {

    private List<Menu> menus;
    private Theme themes;
    private List<Server> servers;

    public List<Menu> getMenus() {
        return menus;
    }

    public void setMenus(List<Menu> menus) {
        this.menus = menus;
    }

    public Theme getThemes() {
        return themes;
    }

    public void setThemes(Theme themes) {
        this.themes = themes;
    }

    public List<Server> getServers() {
        return servers;
    }

    public void setServers(List<Server> servers) {
        this.servers = servers;
    }
}
