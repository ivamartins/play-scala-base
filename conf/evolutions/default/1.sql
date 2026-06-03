-- Evolution for legacy modernization demo

-- # --- !Ups

CREATE TABLE legacy_orders (
  id BIGINT AUTO_INCREMENT PRIMARY KEY,
  customer_id VARCHAR(255) NOT NULL,
  amount DECIMAL(10,2) NOT NULL,
  status VARCHAR(50) NOT NULL,
  created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO legacy_orders (customer_id, amount, status) VALUES
('CUST001', 1250.50, 'PENDING'),
('CUST002', 89.99, 'COMPLETED');

-- # --- !Downs

DROP TABLE legacy_orders;
