package com.example.truck.springboot.truck;


	public class Truck {
		long id;
		String name;
		String author;

		public Truck(long id, String name, String author) {
			super();
			this.id = id;
			this.name = name;
			this.author = author;
		}

		public long getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getAuthor() {
			return author;
		}

		@Override
		public String toString() {
			return String.format("Truck [id=%s, name=%s, author=%s]", id, name, author);
		}

	}
}
