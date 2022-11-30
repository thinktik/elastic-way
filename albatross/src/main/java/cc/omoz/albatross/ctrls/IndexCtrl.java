package cc.omoz.albatross.ctrls;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.reactive.result.view.Rendering;


/**
 * index控制器
 *
 * @author ThinkTik
 */
@Controller
@RequestMapping("/")
public class IndexCtrl {
    /**
     * 应用程序名
     */
    @Value("${spring.application.name}")
    private String appName;
    /**
     * 描述
     */
    @Value("${description}")
    private String description;
    /**
     * index 主页URL
     */
    @Value("${indexUrl}")
    private String indexUrl;

    /**
     * redirect到index
     *
     * @return index页面
     */
    @GetMapping(value = {"", "/index"})
    public Rendering index() {
        return Rendering.redirectTo("https://" + indexUrl).build();
    }
}
