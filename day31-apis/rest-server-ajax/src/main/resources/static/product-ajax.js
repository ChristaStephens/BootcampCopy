$(function() {
	var productsTable = document.getElementById("products-table");
	var searchInput = document.getElementById("search-input");
	
	// Start the page off with all products.
	doSearch();
	
	// Do a new search whenever user types into the search box.
	searchInput.addEventListener("keyup", function() {
		doSearch(searchInput.value);
	});
	
	function doSearch(query) {
		// Build the URL.
		var url = "/products";
		if (query) {
			url += "?name=" + encodeURIComponent(query);
		}
		console.log("FETCH:", url);
		
		// Make the AJAX Request.
		fetch(url)
			.then(response => response.json()) // Parse response as JSON
			.then(function(data) {
				// Handle the response.
				console.log("DATA:", data)
				fillTable(data);
			});
	}
	
	function fillTable(products) {
		// Clear the table and add rows one by one.
		productsTable.innerHTML = "";
		products.forEach(addRow);
	}
	
	function addRow(product) {
		// Add a row to the table.
		productsTable.insertAdjacentHTML('beforeend', `
			<tr>
			  <td>${product.name}</td>
			  <td>${product.price}</td>
			  <td>${product.taxable ? 'Yes' : 'No'}</td>
			</tr>
		`);
	}

});