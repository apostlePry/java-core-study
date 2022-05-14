package com.study.core.tree.class_01;

/**
 * @author test_jia
 * ClassName CreateDir
 * PackageName com.study.core.tree.class_01
 * Description
 * <p>
 * 根据树结构创建目录
 * <p>id, pid, name</p>
 * <p>1, -1, 中国</p>
 * <p>2, 1, 北京</p>
 * <p>3, 1, 天津</p>
 * <p>4, 2, 朝阳</p>
 * <p>5, 4, 高碑店</p>
 * Date: 2022/5/11
 * Time: 下午8:37
 */
public class CreateDir {

    public static void main(String[] args) {

    }
}


class Node {
    private int id;
    private int pid;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Node{" +
                "id=" + id +
                ", pid=" + pid +
                ", name='" + name + '\'' +
                '}';
    }
}
