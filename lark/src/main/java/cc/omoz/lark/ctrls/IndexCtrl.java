package cc.omoz.lark.ctrls;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * index控制器
 *
 * @author ThinkTik
 */
@RestController
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
    public ModelAndView index() {
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("appName", appName);
        mav.addObject("description", description);
        mav.addObject("indexUrl", indexUrl);
        return mav;
    }
}
