/*
 * File: app/store/cbmIlceler.js
 *
 * This file was generated by Sencha Architect version 4.1.1.
 * http://www.sencha.com/products/architect/
 *
 * This file requires use of the Ext JS 6.2.x Classic library, under independent license.
 * License of Sencha Architect does not include license for Ext JS 6.2.x Classic. For more
 * details see http://www.sencha.com/license or contact license@sencha.com.
 *
 * This file will be auto-generated each and everytime you save your project.
 *
 * Do NOT hand edit this file.
 */

Ext.define('XYZPro.store.cbmIlceler', {
    extend: 'Ext.data.Store',

    requires: [
        'XYZPro.model.KonumIlceModel',
        'Ext.data.proxy.Ajax',
        'Ext.data.reader.Json'
    ],

    constructor: function(cfg) {
        var me = this;
        cfg = cfg || {};
        me.callParent([Ext.apply({
            storeId: 'cbmIlceler',
            autoLoad: true,
            model: 'XYZPro.model.KonumIlceModel',
            proxy: {
                type: 'ajax',
                url: '/tanim/getIlcelerByIlId.ajax',
                reader: {
                    type: 'json',
                    rootProperty: 'data',
                    totalProperty: 'totalCount'
                }
            }
        }, cfg)]);
    }
});