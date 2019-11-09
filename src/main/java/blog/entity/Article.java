/**
 * FileName: Article
 * Author:   hy
 * Date:     2019/11/9 20:12
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package blog.entity;

import lombok.Data;

@Data
public class Article {
    private String title;
    private String content;
    private  int diamond;
    private int comment;


    public Article(String title, String content, int diamond, int comment) {
        this.title = title;
        this.content = content;
        this.diamond = diamond;
        this.comment = comment;
    }

    public Article() {
    }
}
