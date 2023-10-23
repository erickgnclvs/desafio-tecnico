/*
 * An XML document type.
 * Localname: getSelosPedidoCompactados
 * Namespace: http://www.tjsc.jus.br/selo
 * Java type: br.jus.tjsc.www.selo.GetSelosPedidoCompactadosDocument
 *
 * Automatically generated - do not modify.
 */
package br.jus.tjsc.www.selo.impl;
/**
 * A document containing one getSelosPedidoCompactados(@http://www.tjsc.jus.br/selo) element.
 *
 * This is a complex type.
 */
public class GetSelosPedidoCompactadosDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements br.jus.tjsc.www.selo.GetSelosPedidoCompactadosDocument
{
    private static final long serialVersionUID = 1L;
    
    public GetSelosPedidoCompactadosDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETSELOSPEDIDOCOMPACTADOS$0 = 
        new javax.xml.namespace.QName("http://www.tjsc.jus.br/selo", "getSelosPedidoCompactados");
    
    
    /**
     * Gets the "getSelosPedidoCompactados" element
     */
    public br.jus.tjsc.www.selo.GetSelosPedidoCompactados getGetSelosPedidoCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosPedidoCompactados target = null;
            target = (br.jus.tjsc.www.selo.GetSelosPedidoCompactados)get_store().find_element_user(GETSELOSPEDIDOCOMPACTADOS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getSelosPedidoCompactados" element
     */
    public void setGetSelosPedidoCompactados(br.jus.tjsc.www.selo.GetSelosPedidoCompactados getSelosPedidoCompactados)
    {
        generatedSetterHelperImpl(getSelosPedidoCompactados, GETSELOSPEDIDOCOMPACTADOS$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "getSelosPedidoCompactados" element
     */
    public br.jus.tjsc.www.selo.GetSelosPedidoCompactados addNewGetSelosPedidoCompactados()
    {
        synchronized (monitor())
        {
            check_orphaned();
            br.jus.tjsc.www.selo.GetSelosPedidoCompactados target = null;
            target = (br.jus.tjsc.www.selo.GetSelosPedidoCompactados)get_store().add_element_user(GETSELOSPEDIDOCOMPACTADOS$0);
            return target;
        }
    }
}
