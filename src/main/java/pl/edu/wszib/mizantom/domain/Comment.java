package pl.edu.wszib.mizantom.domain;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    private String login;
    @NotNull
    private String theme;
    @NotNull
    private String comment;

    public Comment () {
    }

    public Comment (String login, String theme, String comment) {
        this.login = login;
        this.theme = theme;
        this.comment = comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
