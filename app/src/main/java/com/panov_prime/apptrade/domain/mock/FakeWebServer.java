package com.panov_prime.apptrade.domain.mock;

import com.panov_prime.apptrade.model.CenterRepository;
import com.panov_prime.apptrade.model.entities.Product;
import com.panov_prime.apptrade.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/*
 * This class serve as fake server and provides dummy product and category with real Image Urls taken from flipkart
 */
public class FakeWebServer {

	private static FakeWebServer fakeServer;

	void initiateFakeServer() {

		addCategory();

	}

	public void addCategory() {

		ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

		listOfCategory
				.add(new ProductCategoryModel(
						"Двери",
						"межкомнатные",
						"10%",
						"http://www.f-door.com.ua/wp-content/uploads/2017/07/z_slide.png"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Арки",
						"межкомнатные",
						"5%",
						"http://www.f-door.com.ua/wp-content/uploads/2017/08/arka-romanskaya-1-562x850.png"));
		/*listOfCategory
				.add(new ProductCategoryModel(
						"МДФ",
						"накладки",
						"5%",
						"http://390931.a11101.web.hosting-test.net/images/stories/virtuemart/product/verona.png"));*/


		CenterRepository.getCenterRepository().setListOfCategory(listOfCategory);
	}

	public void getAllElectronics() {

		ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

		ArrayList<Product> productlist = new ArrayList<Product>();

		// CITYLine
		productlist
				.add(new Product(
						"CL2",
						"Дверь межкомнатная серии CityLine",
						"ДОСТУПНЫЕ РАЗМЕРЫ: 550, 600 x 1900 мм 400 x 2000 мм 600-900 x 2000 мм.",
						"5490",
						"0",
						"4290",
						"0",
						"http://www.f-door.com.ua/wp-content/uploads/2017/08/CL2_oreh_gorizont_bronze.jpg",
						"oven_1"));

		productlist
				.add(new Product(
						"CL3",
						"Дверь межкомнатная серии CityLine",
						"ДОСТУПНЫЕ РАЗМЕРЫ: 550, 600 x 1900 мм 400 x 2000 мм 600-900 x 2000 мм.",
						"5490",
						"0",
						"4290",
						"0",
						"http://www.f-door.com.ua/wp-content/uploads/2017/08/CL3_oreh_gorizont.jpg",
						"oven_2"));

		productlist
				.add(new Product(
						"CL4",
						"Дверь межкомнатная серии CityLine",
						"ДОСТУПНЫЕ РАЗМЕРЫ: 550, 600 x 1900 мм 400 x 2000 мм 600-900 x 2000 мм.",
						"5290",
						"10",
						"4290",
						"0",
						"http://www.f-door.com.ua/wp-content/uploads/2017/08/CL4_realwood_grafit_black.jpg",
						"oven_3"));

		productlist
				.add(new Product(
						"CL5",
						"Дверь межкомнатная серии CityLine",
						"ДОСТУПНЫЕ РАЗМЕРЫ: 550, 600 x 1900 мм 400 x 2000 мм 600-900 x 2000 мм.",
						"5300",
						"12",
						"4290",
						"0",
						"http://www.f-door.com.ua/wp-content/uploads/2017/08/CL5venge_grey_horizon_black.jpg",
						"oven_4"));

		productlist
				.add(new Product(
						"CL8",
						"Дверь межкомнатная серии CityLine",
						"ДОСТУПНЫЕ РАЗМЕРЫ: 550, 600 x 1900 мм 400 x 2000 мм 600-900 x 2000 мм.",
						"5190",
						"10",
						"4290",
						"0",
						"http://www.f-door.com.ua/wp-content/uploads/2017/08/CL6_realwood_capuchino_kvarts.jpg",
						"oven_5"));

		productMap.put("СЕРИЯ CityLine", productlist);

		ArrayList<Product> tvList = new ArrayList<Product>();

		// СЕРИЯ Z
		tvList.add(new Product(
				"Верона",
				"Дверь межкомнатная серии Z",
				"Ширина	600/700/800/900 мм Высота 2000 мм Толщина 35 мм",
				"16000",
				"12",
				"13990",
				"0",
				"http://www.f-door.com.ua/wp-content/uploads/2015/08/verona.png",
				"tv_1"));

		tvList.add(new Product(
				"Аврора",
				"Дверь межкомнатная серии Z",
				"Ширина	600/700/800/900 мм Высота 2000 мм Толщина 35 мм",
				"17000",
				"12",
				"13990",
				"0",
				"http://www.f-door.com.ua/wp-content/uploads/2017/08/avrora-e1502920762348.png",
				"tv_2"));

		tvList.add(new Product(
				"Анжелика",
				"Дверь межкомнатная серии Z",
				"Ширина	600/700/800/900 мм Высота 2000 мм Толщина 35 мм",
				"18000",
				"12",
				"13990",
				"0",
				"http://www.f-door.com.ua/wp-content/uploads/2017/08/angelika-1.png",
				"tv_3"));

		tvList.add(new Product(
				"Виктория",
				"Дверь межкомнатная серии Z",
				"Ширина	600/700/800/900 мм Высота 2000 мм Толщина 35 мм",
				"16000",
				"12",
				"13990",
				"0",
				"http://390931.a11101.web.hosting-test.net/images/stories/virtuemart/product/viktoria.png",
				"tv_4"));

		tvList.add(new Product(
				"Виола",
				"Дверь межкомнатная серии Z",
				"Ширина	600/700/800/900 мм Высота 2000 мм Толщина 35 мм",
				"16000",
				"12",
				"13990",
				"0",
				"http://390931.a11101.web.hosting-test.net/images/stories/virtuemart/product/viola.png",
				"tv_5"));

		productMap.put("СЕРИЯ Z", tvList);

		productlist = new ArrayList<Product>();

		// СЕРИЯ Монолит
		productlist
				.add(new Product(
						"Алекс",
						"Дверь межкомнатная серии Монолит",
						"Ширина 600/700/800/900 мм Высота 2000 мм Толщина 35 мм",
						"2699",
						"10",
						"2566",
						"0",
						"http://390931.a11101.web.hosting-test.net/images/stories/virtuemart/product/aleks.png",
						"v_cleaner_1"));

		productlist
				.add(new Product(
						"Вена",
						"Дверь межкомнатная серии Монолит",
						"Ширина 600/700/800/900 мм Высота 2000 мм Толщина 35 мм",
						"2699",
						"10",
						"2566",
						"0",
						"http://390931.a11101.web.hosting-test.net/images/stories/virtuemart/product/vena.png",
						"v_cleaner_2"));

		productlist
				.add(new Product(
						"Волна",
						"Дверь межкомнатная серии Монолит",
						"Ширина 600/700/800/900 мм Высота 2000 мм Толщина 35 мм",
						"2699",
						"10",
						"2566",
						"0",
						"http://390931.a11101.web.hosting-test.net/images/stories/virtuemart/product/volna.png",
						"v_cleaner_3"));

		productlist
				.add(new Product(
						"Домино монолит",
						"Дверь межкомнатная серии Монолит",
						"Ширина 600/700/800/900 мм Высота 2000 мм Толщина 35 мм",
						"2699",
						"10",
						"2566",
						"0",
						"http://390931.a11101.web.hosting-test.net/images/stories/virtuemart/product/domino_monolit.png",
						"v_cleaner_4"));

		productlist
				.add(new Product(
						"Кардинал",
						"Дверь межкомнатная серии Монолит",
						"Ширина 600/700/800/900 мм Высота 2000 мм Толщина 35 мм",
						"2699",
						"10",
						"2566",
						"0",
						"http://390931.a11101.web.hosting-test.net/images/stories/virtuemart/product/kardinal.png",
						"v_cleaner_5"));

		productMap.put("СЕРИЯ Монолит", productlist);


		CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

	}

	public void getAllFurnitures() {

		ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

		ArrayList<Product> productlist = new ArrayList<Product>();

		// Арки межкомнатные
		productlist
				.add(new Product(
						" Романская",
						"Арка межкомнатная",
						"Романская арка из МДФ представляет собой конструктор, состоящий из модулей, глубину, ширину и высоту которых можно изменять (увеличивать или уменьшать). Уменьшение производится путем отпиливания ненужных частей, а увеличение – установкой декоративно-расширительных элементов.",
						"10200",
						"12",
						"7000",
						"0",
						"http://390931.a11101.web.hosting-test.net/images/stories/virtuemart/product/romanska_arka.png",
						"table_1"));

	productlist
				.add(new Product(
						" Триуфальная",
						"Арка межкомнатная",
						"Триумфальная арка из МДФ представляет собой конструктор, состоящий из модулей, глубину, ширину и высоту которых можно изменять (увеличивать или уменьшать). Уменьшение производится путем отпиливания ненужных частей, а увеличение – установкой декоративно-расширительных элементов.",
						"10200",
						"12",
						"7000",
						"0",
						"http://390931.a11101.web.hosting-test.net/images/stories/virtuemart/product/trimfalna_arka.png",
						"table_2"));

			/*productlist
				.add(new Product(
						" Wood Coffee Table",
						"Royal Oak Engineered Wood Coffee Table",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"10200",
						"12",
						"7000",
						"0",
						"http://img5a.flixcart.com/image/coffee-table/u/n/p/brass-table0016-rosewood-sheesham-zameerwazeer-beige-400x400-imaedwk5ksph9ut2.jpeg",
						"table_3"));

		productlist
				.add(new Product(
						" Wood Coffee Table",
						"Royal Oak Engineered Wood Coffee Table",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"10200",
						"12",
						"7000",
						"0",
						"http://img6a.flixcart.com/image/coffee-table/v/h/h/side-tb-53-ad-particle-board-debono-acacia-dark-matt-400x400-imaecnctfgjahsnu.jpeg",
						"table_4"));

		productlist
				.add(new Product(
						" Wood Coffee Table",
						"Royal Oak Engineered Wood Coffee Table",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"10200",
						"12",
						"7000",
						"0",
						"http://img5a.flixcart.com/image/coffee-table/c/z/e/afr1096-sm-mango-wood-onlineshoppee-brown-400x400-imaea6c2bhwz8tns.jpeg",
						"table_5"));

		productlist
				.add(new Product(
						" Wood Coffee Table",
						"Royal Oak Engineered Wood Coffee Table",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"10200",
						"12",
						"7000",
						"0",
						"http://img5a.flixcart.com/image/coffee-table/k/y/h/1-particle-board-wood-an-wood-coffee-400x400-imae7uvzqsf4ynan.jpeg",
						"table_6"));*/

		productMap.put("Арки межкомнатные", productlist);

	/*	productlist = new ArrayList<Product>();

		// Chair
		productlist
				.add(new Product(
						"Bean Bag Chair Cover",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img5a.flixcart.com/image/bean-bag/5/b/b/boss-moda-chair-br1088-comf-on-xxxl-400x400-imae9k78vg8gjh3q.jpeg",
						"chair_1"));

		productlist
				.add(new Product(
						"Bean Bag Chair Cover",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img6a.flixcart.com/image/office-study-chair/e/f/p/flversaossblu-stainless-steel-nilkamal-400x400-imaeeptqczc5kbjg.jpeg",
						"chair_2"));

		productlist
				.add(new Product(
						"Bean Bag Chair Cover",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img5a.flixcart.com/image/bean-bag/7/w/b/chr-01-fab-homez-xxxl-400x400-imae9qnbfwr9vkk4.jpeg",
						"chair_3"));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img5a.flixcart.com/image/office-study-chair/h/z/d/adxn275-pu-leatherette-adiko-400x400-imaedpmyhzefdzgz.jpeg",
						"chair_4"));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img5a.flixcart.com/image/office-study-chair/h/z/d/adxn275-pu-leatherette-adiko-400x400-imaedpmyytefgvz7.jpeg",
						"chair_5"));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img6a.flixcart.com/image/office-study-chair/j/y/q/adpn-d021-pp-adiko-400x400-imaee2vrg9bkkxjg.jpeg",
						"chair_6"));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img6a.flixcart.com/image/office-study-chair/k/s/2/adxn-034-pu-leatherette-adiko-400x400-imaedpmyyyg8bdmv.jpeg",
						"chair_7"));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img6a.flixcart.com/image/bean-bag/t/8/n/fk0100391-star-xxxl-400x400-imae72dsb5h2r9uj.jpeg",
						"chair_8"));

		productlist
				.add(new Product(
						"Adiko Leatherette Office Chair",
						"ab Homez XXXL Bean Bag Chair Cover (Without Filling)",
						"With a contemporary design and gorgeous finish, this coffee table will be a brilliant addition to modern homes and even offices. The table has a glass table top with a floral print, and a pull-out drawer in the center.",
						"36500",
						"20",
						"1200",
						"0",
						"http://img5a.flixcart.com/image/bean-bag/3/h/w/rydclassicgreenl-rockyard-large-400x400-imae6zfaz6qzj3jd.jpeg",
						"chair_9"));

		productMap.put("Chairs", productlist);

		productlist = new ArrayList<Product>();

		// Chair
		productlist
				.add(new Product(
						"l Collapsible Wardrobe",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"http://img5a.flixcart.com/image/collapsible-wardrobe/h/h/g/best-quality-3-5-feet-foldable-storage-cabinet-almirah-shelf-400x400-imaees5fq7wbndak.jpeg",
						"almirah_1"));

		productlist
				.add(new Product(
						"l Collapsible Wardrobe",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"http://img6a.flixcart.com/image/collapsible-wardrobe/d/n/s/cb265-carbon-steel-cbeeso-dark-beige-400x400-imaefn9vha2hm9qk.jpeg",
						"almirah_2"));

		productlist
				.add(new Product(
						"l Collapsible Wardrobe",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"http://img6a.flixcart.com/image/wardrobe-closet/b/v/3/srw-146-jute-pindia-blue-400x400-imaeb9g4y6tegzfn.jpeg",
						"almirah_3"));

		productlist
				.add(new Product(
						"l Collapsible Wardrobe",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"http://img6a.flixcart.com/image/cupboard-almirah/y/w/q/100009052-particle-board-housefull-mahogany-400x400-imaebazkwhv64p8q.jpeg",
						"almirah_4"));

		productlist
				.add(new Product(
						"l Collapsible Wardrobe",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"http://img5a.flixcart.com/image/collapsible-wardrobe/w/c/k/srw-116a-aluminium-pindia-maroon-wardrobe-400x400-imaeb9g4945dqunu.jpeg",
						"almirah_5"));

		productlist
				.add(new Product(
						"Metal Free Standing Wardrobe",
						"Everything Imported Carbon Steel Collapsible Wardrobe",
						"Portable Wardrobe Has Hanging Space And Shelves Which Are Very Practical And The Roll Down Cover Keeps The Dust Out",
						"2999",
						"20",
						"1999",
						"0",
						"http://img6a.flixcart.com/image/wardrobe-closet/f/b/p/srw-167-jute-pindia-purple-400x400-imaeb9g4d8uvatck.jpeg",
						"almirah_6"));

		productMap.put("Almirah", productlist);

		productMap.put("Фурнитура", productlist);*/

		CenterRepository.getCenterRepository().setMapOfProductsInCategory(productMap);

	}

	public static FakeWebServer getFakeWebServer() {

		if (null == fakeServer) {
			fakeServer = new FakeWebServer();
		}
		return fakeServer;
	}

	public void getAllProducts(int productCategory) {

		if (productCategory == 0) {

			getAllElectronics();
		} else {

			getAllFurnitures();

		}

	}

}
