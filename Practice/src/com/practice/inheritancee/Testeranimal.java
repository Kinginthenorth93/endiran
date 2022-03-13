package com.practice.inheritancee;

public class Testeranimal {
	public static void main(String[] args) {
		Dog dog=new Dog();
		System.out.println(dog.type);
		dog.whoamI();
		System.out.println("I have "+dog.noofeyes+" eyes");
		System.out.println("I have "+dog.nooflegs+" ears");
		dog.attack();
		dog.living();
		dog.eat();
		System.out.println("______________________________________________________");
		System.out.println("______________________________________________________");
		Lion lion=new Lion();
		lion.whoamI();
		System.out.println("I have "+lion.noofeyes+" eyes");
		System.out.println("I have "+lion.nooflegs+" ears");
		lion.wildattack();
		lion.wildeat();
		lion.wildliving();
		
		
		
		
	}

}
