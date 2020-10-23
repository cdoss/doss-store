CREATE TABLE item(
  item_id INT AUTO_INCREMENT PRIMARY KEY,
  type ENUM('dress','pajamas') DEFAULT NULL,
  item_length ENUM('Short','Short/Long','Long') DEFAULT NULL,
  size ENUM('S','M','L','XL','2XL','3XL','4XL','5XL') DEFAULT NULL,
  designer VARCHAR(32) DEFAULT NULL,
  pattern INT,
  color VARCHAR(16) DEFAULT NULL
);

CREATE TABLE item_pricing(
  item_pricing_id INT AUTO_INCREMENT PRIMARY KEY,
  item_id INT NOT NULL,
  unit_price DECIMAL(5,2) DEFAULT 0.00,
  list_price DECIMAL(5,2) DEFAULT 0.00,
  FOREIGN KEY (item_id) REFERENCES item(item_id) ON DELETE CASCADE
);

CREATE TABLE item_inventory(
  item_inventory_id INT AUTO_INCREMENT PRIMARY KEY,
  item_id INT NOT NULL,
  quantity INT DEFAULT 0,
  FOREIGN KEY (item_id) REFERENCES item(item_id) ON DELETE CASCADE
);

CREATE TABLE customer(
  customer_id INT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(16),
  last_name VARCHAR(16)
);

CREATE TABLE address(
  address_id INT AUTO_INCREMENT PRIMARY KEY,
  customer_id INT NOT NULL,
  house_number INT,
  street_name VARCHAR(64),
  city VARCHAR(64),
  state VARCHAR(32),
  zip_code VARCHAR(10),
  FOREIGN KEY (customer_id) REFERENCES customer(customer_id) ON DELETE CASCADE
);

CREATE TABLE customer_profile(
  customer_profile_id INT AUTO_INCREMENT PRIMARY KEY,
  customer_id INT NOT NULL,
  phone_number VARCHAR(10),
  FOREIGN KEY (customer_id) REFERENCES customer(customer_id) ON DELETE CASCADE
);

CREATE TABLE customer_order(
  customer_order_id INT AUTO_INCREMENT PRIMARY KEY,
  customer_id INT NOT NULL,
  shipping_address INT DEFAULT NULL,
  order_date DATE DEFAULT (CURRENT_DATE),
  order_price DECIMAL(10,2) DEFAULT 0.00,
  shipping_price DECIMAL(10,2) DEFAULT 0.00,
  order_total_price DECIMAL(10,2) DEFAULT 0.00,
  FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
  FOREIGN KEY (shipping_address) REFERENCES address(address_id)
);

CREATE TABLE customer_order_detail(
  customer_order_detail_id INT AUTO_INCREMENT PRIMARY KEY,
  customer_order_id INT NOT NULL,
  item_id INT NOT NULL,
  quantity INT,
  list_price DECIMAL(10,2),
  FOREIGN KEY (customer_order_id) REFERENCES customer_order(customer_order_id),
  FOREIGN KEY (item_id) REFERENCES item(item_id)
);

CREATE TABLE supplier(
  supplier_id INT AUTO_INCREMENT PRIMARY KEY,
  first_name VARCHAR(16),
  last_name VARCHAR(16),
  company VARCHAR(64) DEFAULT NULL
);

CREATE TABLE supply_order(
  supply_order_id INT AUTO_INCREMENT PRIMARY KEY,
  supplier_id INT NOT NULL,
  order_date DATE DEFAULT (CURRENT_DATE),
  order_price DECIMAL(10,2) DEFAULT 0.00,
  shipping_price DECIMAL(10,2) DEFAULT 0.00,
  order_total_price DECIMAL(10,2) DEFAULT 0.00,
  discount_price DECIMAL(10,2) DEFAULT 0.00,
  refund_price DECIMAL(10,2) DEFAULT 0.00,
  FOREIGN KEY (supplier_id) REFERENCES supplier(supplier_id)
);

CREATE TABLE supplier_item_pricing(
  supplier_item_pricing_id INT AUTO_INCREMENT PRIMARY KEY,
  supplier_id INT NOT NULL,
  item_id INT NOT NULL,
  unit_price DECIMAL(5,2) DEFAULT 0.00,
  FOREIGN KEY (supplier_id) REFERENCES supplier(supplier_id) ON DELETE CASCADE,
  FOREIGN KEY (item_id) REFERENCES item(item_id) ON DELETE CASCADE
);

CREATE TABLE supply_order_detail(
  supply_order_detail_id INT AUTO_INCREMENT PRIMARY KEY,
  supply_order_id INT NOT NULL,
  item_id INT NOT NULL,
  quantity INT,
  unit_price INT,
  FOREIGN KEY (supply_order_id) REFERENCES supply_order(supply_order_id),
  FOREIGN KEY (item_id) REFERENCES item(item_id),
  FOREIGN KEY (unit_price) REFERENCES supplier_item_pricing(supplier_item_pricing_id)
);
