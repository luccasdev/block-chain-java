package model;


import lombok.Getter;
import util.HashUtil;

import java.util.Date;

@Getter
public class Block<T> {

    private T data;

    private String hash;

    private String previousHash;

    private Long timestamp;

    public Block(T data, String previousHash) {
        this.data = data;
        this.hash = this.generateHash();
        this.previousHash = previousHash;
        this.timestamp = new Date().getTime();
    }

    public String generateHash() {
        return HashUtil.applySha256(
                previousHash +
                        this.timestamp +
                        data
        );
    }
}
