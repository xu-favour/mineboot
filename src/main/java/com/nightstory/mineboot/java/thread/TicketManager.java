package com.nightstory.mineboot.java.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TicketManager {
 

    private List<Ticket> tickets =new ArrayList<>();
 
    void generateTicket(){
        for(int i =0;i<100;i++){
            if(i%5==0){
                tickets.add(new Ticket("杭州","北京","8:00",(Math.random()*1000)+1000));
            }else if(i%5==1){
                tickets.add(new Ticket("上海","北京","8:00",(Math.random()*1000)+1000));
            }else if(i%5==2){
                tickets.add(new Ticket("杭州","北京","9:00",(Math.random()*1000)+1000));
            }else if(i%5==3){
                tickets.add(new Ticket("上海","北京","9:00",(Math.random()*1000)+1000));
            }else {
                tickets.add(new Ticket("杭州","北京","9:00",(Math.random()*1000)));
            }
        }
    }
    public Ticket search(String from, String to, String time) {
        //请实现TODO
        List<Ticket> collect = tickets.stream()
                .filter(x -> x.getFrom().equals(from))
                .filter(x -> x.getTo().equals(to))
                .filter(x -> x.getTime().equals(time))
                .sorted((x, y) -> {
                    return new Double(x.getPrice() - y.getPrice()).intValue();
                })
                .collect(Collectors.toList());
 
        return collect.get(0);
    }
 
    public static void main(String[] args) {
        TicketManager ticketManager = new TicketManager();
        ticketManager.generateTicket();
        Ticket ticket = ticketManager.search("杭州","北京","9:00");
        System.out.println(ticket);
    }
}
 
class Ticket {
    private String from;
    private String to;
    private String time;
    private double price;
 
    @Override
    public String toString() {
        return "Ticket{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", time='" + time + '\'' +
                ", price=" + price +
                '}';
    }
 
    public Ticket(String from, String to, String time, double price) {
        this.from = from;
        this.to = to;
        this.time = time;
        this.price = price;
    }
 
    public String getFrom() {
        return from;
    }
 
    public void setFrom(String from) {
        this.from = from;
    }
 
    public String getTo() {
        return to;
    }
 
    public void setTo(String to) {
        this.to = to;
    }
 
    public String getTime() {
        return time;
    }
 
    public void setTime(String time) {
        this.time = time;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
}