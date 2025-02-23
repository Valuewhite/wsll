package com.itheima.pojo;

public class Result {
    private Integer code;
    private String meg;
    private Object data;
    public static Result success(Object data){
        return new Result(1, "success", data);
    }
    public static Result success(){
        return new Result(1, "success", null);
    }
    public static Result error(String meg){
        return new Result(0, meg, null);
    }
    public Result() {
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", meg='" + meg + '\'' +
                ", data=" + data +
                '}';
    }

    public Result(Integer code, String meg, Object data) {
        this.code = code;
        this.meg = meg;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMeg() {
        return meg;
    }

    public void setMeg(String meg) {
        this.meg = meg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
