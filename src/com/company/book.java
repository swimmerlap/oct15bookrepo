package com.company;

public class book {



        // members and methods
        private String booktitle;
        private String author;
        private String description;
        private String price;
        private String isInStock;

        // default constructor


    public book() {
    }

    public book(String booktitle, String author, String description, String price, String isInStock) {
        this.booktitle = booktitle;
        this.author = author;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    public String getBooktitle() {
            return booktitle;
        }

        public void setBooktitle(String booktitle) {
            this.booktitle = booktitle;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getIsInStock() {
            return isInStock;
        }

        public void setIsInStock(String isInStock) {
            this.isInStock = isInStock;
        }

        public void getDisplayText()
        {
            System.out.println(author);
            System.out.println(booktitle);
            System.out.println(description);
        }
    }


