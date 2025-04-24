package app;

import java.util.ArrayList;
import java.util.List;

//HINT:	utilパッケージにメッセージがまとまっているクラスがあるからインポートしてみよう。
//THINK: より大きなシステムになることを想定した時、メッセージだけ別のクラスでまとめることによる利点を考えてください。

/**
 * 在庫を管理するためのクラス。商品の追加、在庫表示、商品検索といった機能を提供する
 * 
 * @author 教育PJ
 * @since 2024/8/13(2025/4月修正版) 
 */

public class InventoryService {

	private List<ProductBean> products = new ArrayList<>();

	/**
	 * 商品を在庫に追加するメソッド。
	 * @param product 追加する商品
	 */
	public void addProduct(ProductBean product) {
		// TODO: Q5:productsリストに引数で受け取ったproductを追加してください。【６点】
	  
	    products.add(product);
	    System.out.println("商品が追加されました" + product.getName());
		// TODO: Q6:商品が追加されたことを表示してください。（例: "商品が追加されました: " + product.getName()）【６点】
		// メッセージは定数を利用すること
	    
		//THINK: MessageConstantsクラスの各フィールドにstatic修飾子がついている利点を考えてください。

	}

	/**
	 * 現在の在庫を表示するメソッド。
	 */
	public void displayInventory() {
		// TODO: Q7:在庫がない場合、「"在庫はありません。"」と表示してください。【６点】
	    for(ProductBean product : products)
	    if(product.getQuantity() <= 0) {
	        System.out.println("在庫はありません");
	        return;
	    }
	    for(ProductBean product : products) {
	        System.out.println("商品" + product.getName() + "数量" + product.getQuantity());
	    }
	      
	    
		// TODO: Q8:在庫がある場合は、在庫のヘッダーを表示してください。（例: "現在の在庫:"）【６点】
		// TODO: Q9:productsリスト内の各商品について、商品名と数量を並べて表示してください。（例： 商品：　, 数量：　）【８点】

	}

	/**
	 * 指定された名前の商品を検索するメソッド。
	 * @param name 検索する商品の名前
	 * @return 見つかった商品、またはnull
	 */
	public ProductBean searchProduct(String name) {

	    for (ProductBean product : products) {
	        
	            // 大小区別ありで比較
	            if (product.getName().equals(product)) {
	                System.out.println("一致する商品が見つかりました：" + product.getName());
	                return product;
	    }
	}
	    
        return null;
	}
}
            
	    
		// TODO: Q10:productsリスト内の各商品について、指定された名前と一致するかを確認してください。(文字の大小を区別しない)【６点】
		//補足: 文字列の比較はequalsIgnoreCaseメソッドを使用する
		// TODO: Q11:一致する商品が見つかった場合、その商品を返してください。【６点】
		// TODO: Q12:一致する商品が見つからなかった場合、nullを返してください。【６点】
	
	

