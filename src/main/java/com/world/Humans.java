package com.world;

public class Humans {
	
		String name;
		int age;
		String believer;
		String religion;
		String country;
		String nationality;
		String behaviour;
		String gender;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getBeliever() {
			return believer;
		}

		public void setBeliever(String believer) {
			this.believer = believer;
		}

		public String getReligion() {
			return religion;
		}

		public void setReligion(String religion) {
			this.religion = religion;
		}

		public String getCountry() {
			return country;
		}

		public void setCountry(String country) {
			this.country = country;
		}

		public String getNationality() {
			return nationality;
		}

		public void setNationality(String nationality) {
			this.nationality = nationality;
		}

		public String getBehaviour() {
			return behaviour;
		}

		public void setBehaviour(String behaviour) {
			this.behaviour = behaviour;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return "Humans [name=" + name + ", age=" + age + ", believer=" + believer + ", religion=" + religion
					+ ", country=" + country + ", nationality=" + nationality + ", behaviour=" + behaviour + ", gender="
					+ gender + "]";
		}

		public Humans(String name, int age, String believer, String religion, String country, String nationality,
				String behaviour, String gender) {
			super();
			this.name = name;
			this.age = age;
			this.believer = believer;
			this.religion = religion;
			this.country = country;
			this.nationality = nationality;
			this.behaviour = behaviour;
			this.gender = gender;
		}

		public Humans() {
			super();
			
		}

	}


