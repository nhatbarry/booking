use booking
go

insert into homestay
values
(N'Lii’s Homestay', N'9C, ngách 12/2 Đặng Thai Mai, phường Quảng An, quận Tây Hồ, thành phố Hà Nội', 0, 680000)
, (N'Nhà Của Bu', N'12A Lý Nam Đế, phường Hàng Mã, quận Hoàn Kiếm, Hà Nội', 0, 650000)
, (N'Dadia', N'13 Nguyễn Khắc Cần, phường Phan Chu Trinh, quận Hoàn Kiếm, thành phố Hà Nội', 0, 600000)
, (N'Nhà Bên Rừng', N'Thôn Lâm Trường, Xã Minh Phú, Sóc Sơn, Hà Nội', 0, 1200000)
, (N'Le Bleu Indie Apartment Hà Nội', N'số 116 Ngõ 10, Đường Nguyên Hồng, Thành Công, Ba Đình, Hà Nội', 0, 300000)
, (N'Cá Homestay Hà Nội', N'121 Đại La, phường Trương Định, quận Hai Bà Trưng, thành phố Hà Nội', 0, 440000)
, (N'Veque Villa Homestay Hà Nội', N'21B Xóm Hạ Hồi, phường Trần Hưng Đạo, quận Hoàn Kiếm, thành phố Hà Nội', 0, 500000)
, (N'Sazi Homestay Hà Nội', N'75 Hàng Bông, phường Hàng Bông, quận Hoàn Kiếm, thành phố Hà Nội', 0, 800000)
, (N'Mộng Homestay Hà Nội', N' 4/9 ngõ 435 Hồng Hà, phường Phúc Tân, quận Hoàn Kiếm, thành phố Hà Nội', 0, 400000)
, (N'City Center & Good Security Area ', N'Số 8 ngõ 77 Lê Hồng Phong, Ba Đình, Hà Nội', 0, 500000)
, (N'An House Homestay Hà Nội', N'208 ngõ 142 Phú Viên, phường Bồ Đề, quận Long Biên, thành phố Hà Nội', 0, 510000)
, (N'Harmony House Homestay Hà Nội', N'36 Ngõ Phất Lộc, phường Hàng Buồm, quận Hoàn Kiếm, thành phố Hà Nội', 0, 580000)
, (N'Mei’s Hideaway Homestay Hà Nội', N'2 Nhà Thờ, phường Hàng Trống, quận Hoàn Kiếm, thành phố Hà Nội', 0, 1200000)
, (N'Sapiens Phố Cổ Hà Nội Homestay', N'68 Hàng Bông, phường Hàng Bông, quận Hoàn Kiếm, thành phố Hà Nội', 0, 599000)
, (N'Mia Casa by Satori Homestay Hà Nội', N'26 Nam Ngư, phường Cửa Nam, quận Hoàn Kiếm, thành phố Hà Nội', 0, 900000)
, (N'Gap Yolo Hostel', N'1B Quốc Tử Giám, quận Đống Đa, thành phố Hà Nội', 0, 135000)
, (N'Airy Budget Homestay', N'Số 8, Ngõ Hàm Long, đường Phan Chu Trinh, Hoàn Kiếm, Hà Nội', 0, 280000)
, (N'Anchie Homestay', N'số 40 ngõ 93, phố Lý Nam Đế, Phường Cửa Đông, Quận Hoàn Kiếm, Quận Ba Đình, Hà Nội', 0, 500000)
, (N'Tre House Homestay', N'ngõ 781 Đường Hồng Hà, Chương Dương Độ, Hoàn Kiếm, Hà Nội', 0, 150000)
, (N'Tuti Homestay Hanoi', N'số 06 Tông Đản, Hoàn Kiếm, Hà Nội', 0, 600000)
go


insert into people
values
('nhat', '1234', N'Lê Anh Nhật', '0354059004', 'nhatbarry@gmail.com', 'manager', NULL)
, ('hung', '1234', N'Phạm Việt Hưng', NULL, NULL, 'manager', NULL)
, ('tung', '1234', N'Nguyễn Tài Tùng', NULL, NULL, 'manager', NULL)
, ('huy', '1234', N'Phạm Văn Huy', NULL, NULL, 'manager', NULL)
, ('tien', '1234', N'Trần Việt Tiến', NULL, NULL, 'manager', NULL)
, ('jack', '1234', N'Trịnh Trần Phương Tuấn', NULL, NULL, 'customer', NULL)
, ('sontung', '123456', N'Nguyễn Thanh Tùng', NULL, NULL, 'customer', NULL)
, ('ccmk', '123456', N'Nguyễn Văn Quang', NULL, NULL, 'customer', NULL)
, ('mck', '123456', N'Nghiêm Vũ Hoàng Long', NULL, NULL, 'customer', NULL)
, ('tlinh', '123456', N'Trần Thảo Linh', NULL, NULL, 'customer', NULL)
go

select * from people
select * from homestay
