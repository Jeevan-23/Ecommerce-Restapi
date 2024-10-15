
CREATE TABLE Seller (
    sellerId INT PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    mobileNo VARCHAR(20),
    emailId VARCHAR(255),
    password VARCHAR(255)
);

CREATE TABLE Product (
    productId INT PRIMARY KEY AUTO_INCREMENT,
    productName VARCHAR(255) NOT NULL,
    price DECIMAL(10, 2),
    manufacturer VARCHAR(255),
    quantity INT,
    category ENUM('LAPTOPS', 'MOBILES', 'SNEAKERS', 'SHIRTS', 'BOTTLES', 'HEADPHONES'), -- Placeholder categories
    status ENUM('ACTIVE', 'INACTIVE', 'OUT_OF_STOCK'),
    sellerId INT,
    description TEXT,
    FOREIGN KEY (sellerId) REFERENCES Seller(sellerId)
);


CREATE TABLE Customer (
    customerId INT PRIMARY KEY AUTO_INCREMENT,
    firstName VARCHAR(255),
    lastName VARCHAR(255),
    mobileNo VARCHAR(20),
    emailId VARCHAR(255),
    password VARCHAR(255),
    createdOn DATETIME,
    creditCardNumber VARCHAR(255)
);


CREATE TABLE Cart (
    cartId INT PRIMARY KEY AUTO_INCREMENT,
    customerId INT,
    cartTotal DECIMAL(10, 2),
    FOREIGN KEY (customerId) REFERENCES Customer(customerId)
);


CREATE TABLE CartItem (
    cartItemId INT PRIMARY KEY AUTO_INCREMENT,
    productId INT,
    cartItemQuantity INT,
    cartId INT,
    FOREIGN KEY (productId) REFERENCES Product(productId),
    FOREIGN KEY (cartId) REFERENCES Cart(cartId)
);

CREATE TABLE Address (
    addressId INT PRIMARY KEY AUTO_INCREMENT,
    streetNo VARCHAR(255),
    buildingName VARCHAR(255),
    locality VARCHAR(255),
    city VARCHAR(255),
    state VARCHAR(255),
    pincode VARCHAR(20),
    customerId INT,
    FOREIGN KEY (customerId) REFERENCES Customer(customerId)
);

CREATE TABLE Orders (
    orderId INT PRIMARY KEY AUTO_INCREMENT,
    orderDate DATE,
    total DECIMAL(10, 2),
    customerId INT,
    creditCardNumber VARCHAR(255),
    orderStatus ENUM('PENDING', 'SHIPPED', 'DELIVERED', 'CANCELLED'),
    addressId INT,
    FOREIGN KEY (customerId) REFERENCES Customer(customerId),
    FOREIGN KEY (addressId) REFERENCES Address(addressId)
);

CREATE TABLE OrderItem (
    orderItemId INT PRIMARY KEY AUTO_INCREMENT,
    orderId INT,
    productId INT,
    quantity INT,
    price DECIMAL(10, 2),
    FOREIGN KEY (orderId) REFERENCES Orders(orderId),  -- Changed to Orders
    FOREIGN KEY (productId) REFERENCES Product(productId)
);

CREATE TABLE UserSession (
    sessionId INT PRIMARY KEY AUTO_INCREMENT,
    token VARCHAR(255),
    userId INT,
    userType ENUM('CUSTOMER', 'SELLER', 'ADMIN'),
    sessionStartTime DATETIME,
    sessionEndTime DATETIME
);

CREATE TABLE Image_Table (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    image LONGBLOB, -- Stores the binary image data
    date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    productId INT, -- Foreign key to Product table
    FOREIGN KEY (productId) REFERENCES Product(productId)
);
