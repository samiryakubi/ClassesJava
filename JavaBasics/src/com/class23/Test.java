package com.class23;

public class Test {
	public static void main(String[] args) {
		System.out.println("---Creating Employee object---");
		Employee emp=new Employee();
		emp.salary=90000;
		emp.getPaid();

		System.out.println("---Creating SrumTeam object---");
		ScrumTeam st=new ScrumTeam();
		st.salary=100000;
		st.getPaid();
		st.artifacts="Product Backlog,Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("---Creating Developer object---");
		Developer dev =new Developer();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprit backlog";
		dev.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		System.out.println("---Creating Tester object---");
		Tester qa =new Tester();
		qa.salary=100000;
		qa.getPaid();
		qa.artifacts="Sprit backlog";
		qa.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
	
		System.out.println("---Creating Bussiness Analyst object---");
		BussinessAnalyst ba =new BussinessAnalyst();
		ba.salary=85000;
		ba.getPaid();
		ba.artifacts="Sprit backlog, Product Backlog";
		ba.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		
		System.out.println("---Creating Scrum Master object---");
		ScrumMaster sm =new ScrumMaster();
		sm.salary=90000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprit grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		
		System.out.println("---Creating Product Owner object---");
		ProductOwner po =new ProductOwner();
		po.salary=150000;
		po.getPaid();
		po.artifacts="Sprit backlog, Product Backlog";
		po.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
		System.out.println("---Manual  Tester---");
		ManualTester m =new ManualTester();
		m.salary=75000;
		m.getPaid();
		m.artifacts="Sprit backlog, Product Backlog";
		m.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		m.workOnArtifacts();
		m.attendScrumMeetings();
		m.TestManually();
		m.test();
		
		System.out.println("---Automation Tester---");
		AutomationTester Auto =new AutomationTester();
		Auto.salary=84000;
		Auto.getPaid();
		Auto.artifacts="Sprit backlog, Product Backlog";
		Auto.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		Auto.workOnArtifacts();
		Auto.attendScrumMeetings();
		Auto.CodeInJava();
		Auto.test();
		
		System.out.println("---FrontEndDeveloper---");
		FrontEndDeveloper FE =new FrontEndDeveloper();
		FE.salary=12000;
		FE.getPaid();
		FE.artifacts="Sprit backlog, Product Backlog";
		FE.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		FE.workOnArtifacts();
		FE.attendScrumMeetings();
		FE.DoHtml();
		FE.code();
	
		System.out.println("---BackEndDeveloper---");
		BackEndDeveloper BE =new BackEndDeveloper();
		BE.salary=135000;
		BE.getPaid();
		BE.artifacts="Sprit backlog, Product Backlog";
		BE.ceremonies="Sprit grooming, Sprint Planning, Sprint Demo";
		BE.workOnArtifacts();
		BE.attendScrumMeetings();
		BE.DoSql();
		BE.code();
	}
  }
