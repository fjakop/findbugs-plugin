package jp.co.worksap.oss.findbugs.jpa;

import javax.persistence.Column;

public class ColumnWithoutElement {
    @Column
    private String name;

    public String getName() {
        return name;
    }
}
