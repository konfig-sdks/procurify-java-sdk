package com.konfigthis.client;

import com.konfigthis.client.api.AccountCodesApi;
import com.konfigthis.client.api.AccountsApi;
import com.konfigthis.client.api.ApApi;
import com.konfigthis.client.api.CatalogApi;
import com.konfigthis.client.api.CurrenciesApi;
import com.konfigthis.client.api.CustomFieldsApi;
import com.konfigthis.client.api.DepartmentsApi;
import com.konfigthis.client.api.LocationsApi;
import com.konfigthis.client.api.OauthApi;
import com.konfigthis.client.api.OrderItemsApi;
import com.konfigthis.client.api.PermissionsApi;
import com.konfigthis.client.api.PurchaseOrdersApi;
import com.konfigthis.client.api.RequisitionsApi;
import com.konfigthis.client.api.UsersApi;
import com.konfigthis.client.api.VendorsApi;

public class Procurify {
    private ApiClient apiClient;
    public final AccountCodesApi accountCodes;
    public final AccountsApi accounts;
    public final ApApi ap;
    public final CatalogApi catalog;
    public final CurrenciesApi currencies;
    public final CustomFieldsApi customFields;
    public final DepartmentsApi departments;
    public final LocationsApi locations;
    public final OauthApi oauth;
    public final OrderItemsApi orderItems;
    public final PermissionsApi permissions;
    public final PurchaseOrdersApi purchaseOrders;
    public final RequisitionsApi requisitions;
    public final UsersApi users;
    public final VendorsApi vendors;

    public Procurify() {
        this(null);
    }

    public Procurify(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.accountCodes = new AccountCodesApi(this.apiClient);
        this.accounts = new AccountsApi(this.apiClient);
        this.ap = new ApApi(this.apiClient);
        this.catalog = new CatalogApi(this.apiClient);
        this.currencies = new CurrenciesApi(this.apiClient);
        this.customFields = new CustomFieldsApi(this.apiClient);
        this.departments = new DepartmentsApi(this.apiClient);
        this.locations = new LocationsApi(this.apiClient);
        this.oauth = new OauthApi(this.apiClient);
        this.orderItems = new OrderItemsApi(this.apiClient);
        this.permissions = new PermissionsApi(this.apiClient);
        this.purchaseOrders = new PurchaseOrdersApi(this.apiClient);
        this.requisitions = new RequisitionsApi(this.apiClient);
        this.users = new UsersApi(this.apiClient);
        this.vendors = new VendorsApi(this.apiClient);
    }

}
