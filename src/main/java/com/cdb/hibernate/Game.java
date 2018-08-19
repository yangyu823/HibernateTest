package com.cdb.hibernate;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name ="game_table")
//@Cacheable
//@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
public class Game {
    @Id
    private int gid;
    private String gname;
    private String platform;
    private int price;

    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gid=" + gid +
                ", gname='" + gname + '\'' +
                ", platform='" + platform + '\'' +
                ", price=" + price +
                '}';
    }
}
