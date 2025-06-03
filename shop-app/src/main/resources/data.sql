INSERT INTO ACCOUNTS (
    first_name,
    last_name,
    contact_no,
    email,
    address,
    username,
    password,
    role,
    enabled
) VALUES (
    'Admin',
    'User',
    '09171234567',
    'admin@example.com',
    '123 Admin St, Metro City',
    'admin',
    '{bcrypt}$2a$10$WzKldOw9fV3Duv49iYh.EOqZnA8WyfX9UQsmnZXvjIrCAZ8zqZTeK', -- password: admin123
    'ROLE_ADMIN',
    TRUE
);