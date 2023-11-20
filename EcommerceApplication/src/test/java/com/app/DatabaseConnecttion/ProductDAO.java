package com.app.DatabaseConnecttion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO {
	
	
	public int getStockQuantity(String productName) {
        int stockQuantity = 0;

        try (Connection connection = DatabaseConnector.getConnection()) {
            String sql = "SELECT stock_quantity FROM products WHERE product_name = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, productName);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    stockQuantity = resultSet.getInt("stock_quantity");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return stockQuantity;
    }	
	
}

//    public List<String> getSimilarProducts(String productName) {
//    	
//    			//======================TO fetch all Products from Db
//    	List<String> allProducts = new ArrayList<>();
//
//        try (Connection connection = DatabaseConnector.getConnection()) {
//            String sql = "SELECT product_name FROM products";
//            try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//                ResultSet resultSet = preparedStatement.executeQuery();
//
//                while (resultSet.next()) {
//                    allProducts.add(resultSet.getString("product_name"));
//                }
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return allProducts;
//    }
//}
        
    	
        //============================TO Fetch Only similar products from DB
//    	 List<String> similarProducts = new ArrayList<>();
//
//         try (Connection connection = DatabaseConnector.getConnection()) {
//             String sql = "SELECT product_name FROM products WHERE product_name LIKE ?";
//             try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
//                 preparedStatement.setString(1, "%" + productName + "%");
//                 ResultSet resultSet = preparedStatement.executeQuery();
//
//                 while (resultSet.next()) {
//                     similarProducts.add(resultSet.getString("product_name"));
//                 }
//             }
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//
//         return similarProducts;
//     }	
//    	
//    }


