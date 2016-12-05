package com.verein.bean.sql;

/**
 * Created by LinYaoyao on 16/12/2.
 */
public class People {
    private int id;
    private int person_id;
    private int article_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPerson_id() {
        return person_id;
    }

    public void setPerson_id(int person_id) {
        this.person_id = person_id;
    }

    public int getArticle_id() {
        return article_id;
    }

    public void setArticle_id(int article_id) {
        this.article_id = article_id;
    }

    @Override
    public String toString() {
        return "People{" +
                "id=" + id +
                ", person_id=" + person_id +
                ", article_id=" + article_id +
                '}';
    }
}
