/*
 * File: app/model/AdresModel.js
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

Ext.define('XYZPro.model.AdresModel', {
    extend: 'Ext.data.Model',
    alias: 'model.adresmodel',

    requires: [
        'Ext.data.field.String',
        'Ext.data.field.Integer'
    ],

    fields: [
        {
            type: 'string',
            name: 'adres_detay1'
        },
        {
            type: 'string',
            name: 'il'
        },
        {
            type: 'string',
            name: 'adres_detay2'
        },
        {
            type: 'string',
            name: 'ilce'
        },
        {
            type: 'string',
            name: 'adres_tipi'
        },
        {
            type: 'int',
            name: 'id'
        },
        {
            type: 'string',
            name: 'ic_kapi_no'
        },
        {
            type: 'string',
            name: 'dis_kapi_no'
        }
    ]
});